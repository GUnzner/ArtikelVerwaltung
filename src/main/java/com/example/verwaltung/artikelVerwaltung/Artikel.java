package com.example.verwaltung.artikelVerwaltung;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Artikel {
	 	private String name;
	    private Double preis;
	    private String kategorie;
	    private boolean verfuegbarkeit;
	    private String bild;
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
		public String getBild() {
			return bild;
		}
		public void setBild(String bild) {
			this.bild = bild;
		}
		public Artikel(String name, Double preis, String kategorie, boolean verfuegbarkeit, String bild) {
			super();
			this.name = name;
			this.preis = preis;
			this.kategorie = kategorie;
			this.verfuegbarkeit = verfuegbarkeit;
			this.bild = bild;
		}
		public Artikel() {
			super();
		} 
	    
	    
}
