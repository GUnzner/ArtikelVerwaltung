package com.example.verwaltung.artikelVerwaltung;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ArtikelService {

	private final List<Artikel> sortiment = new ArrayList<>();

	public ArtikelService() {
		sortiment.add(new Artikel("Filzpantoffeln Rudolph", 29.95, "Hausschuhe", true));
		sortiment.add(new Artikel("Winterstiefel Alaska", 49.95, "Stiefel", false));
		sortiment.add(new Artikel("Sommersandalen Capri", 19.95, "Sandalen", true));
		sortiment.add(new Artikel("Gummistiefel Sven", 39.95, "Stiefel", false));
		sortiment.add(new Artikel("Filzpantoffeln Rudolph", 29.95, "Hausschuhe", true));
		sortiment.add(new Artikel("Winterstiefel Alaska", 49.95, "Stiefel", false));
		sortiment.add(new Artikel("Sommersandalen Capri", 19.95, "Sandalen", true));
		sortiment.add(new Artikel("Gummistiefel Sven", 39.95, "Stiefel", false));
	}

	public List<Artikel> getSortiment() {
		return sortiment;
	}

	public void addArtikel(Artikel artikel) {
		sortiment.add(artikel);
	}

	public boolean isMaxLimitReached(int max) {
		return sortiment.size() >= max;
	}

}
