package com.example.verwaltung.artikelVerwaltung;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtikelController {
	@GetMapping("/hello-world")
	public String test() {
		return "Hello world!";
	}
}
