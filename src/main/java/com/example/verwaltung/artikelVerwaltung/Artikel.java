package com.example.verwaltung.artikelVerwaltung;

import java.time.LocalDate;

public class Artikel {
	private String name;
	private Double preis;
	private String kategorie;
	private boolean verfuegbarkeit;
	private LocalDate verfuegbarAb;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPreis() {
		return preis;
	}

	public void setPreis(Double preis) {
		this.preis = preis;
	}

	public String getKategorie() {
		return kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}

	public boolean isVerfuegbarkeit() {
		return verfuegbarkeit;
	}

	public void setVerfuegbarkeit(boolean verfuegbarkeit) {
		this.verfuegbarkeit = verfuegbarkeit;
	}

	public LocalDate getVerfuegbarAb() {
		return verfuegbarAb;
	}

	public void setVerfuegbarAb(LocalDate verfuegbarAb) {
		this.verfuegbarAb = verfuegbarAb;
	}

	public Artikel(String name, Double preis, String kategorie, boolean verfuegbarkeit) {
		super();
		this.name = name;
		this.preis = preis;
		this.kategorie = kategorie;
		this.verfuegbarkeit = verfuegbarkeit;
	}

	public Artikel() {
		super();
	}

}
