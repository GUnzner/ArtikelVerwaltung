package com.example.verwaltung.artikelVerwaltung;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ArtikelController {

	private static final int MAX_ARTIKEL = 10;
	private final ArtikelService artikelService;

	public ArtikelController(ArtikelService artikelService) {
		this.artikelService = artikelService;
	}
	
	@ModelAttribute("artikel")
	public Artikel artikel() {
	    return new Artikel();
	}


	@GetMapping("/")
	public String index(Model model) {
	    model.addAttribute("sortiment", artikelService.getSortiment());
	    model.addAttribute("today", LocalDate.now().toString());
	    return "index";
	}


	@PostMapping("/addArtikel")
	public String addArtikel(@ModelAttribute Artikel artikel, BindingResult result, RedirectAttributes redirectAttributes, Model model) {
		
		if (artikel.isVerfuegbarkeit() && artikel.getVerfuegbarAb() != null) {
	        result.rejectValue("verfuegbarAb", "date.not.allowed", "Verfügbar ab darf nur gesetzt werden, wenn Artikel noch nicht verfügbar ist.");
	    }

	    if (artikel.getVerfuegbarAb() != null && artikel.getVerfuegbarAb().isBefore(LocalDate.now())) {
	        result.rejectValue("verfuegbarAb", "date.past", "Das Datum darf nicht in der Vergangenheit liegen.");
	    }
		
	    if (result.hasErrors()) {
	        model.addAttribute("sortiment", artikelService.getSortiment());
	        return "index";  
	    }
	    
		if (artikelService.isMaxLimitReached(MAX_ARTIKEL)) {
	        redirectAttributes.addFlashAttribute("errorMessage", "Maximale Anzahl von Artikeln erreicht (10).");
	        model.addAttribute("sortiment", artikelService.getSortiment());
	        return "redirect:/";
	    }

	    artikelService.addArtikel(artikel);
	    return "redirect:/";
	}
	

}
