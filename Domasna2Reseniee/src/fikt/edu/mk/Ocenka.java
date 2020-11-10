package fikt.edu.mk;

import java.util.Date;

public class Ocenka {
	private String predmet;
	private Date data;
	private int ocenka;

	public Ocenka(String predmet, Date data, int ocenka) {
		super();
		this.predmet = predmet;
		this.data = data;
		this.ocenka = ocenka;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getOcenka() {
		return ocenka;
	}

	public void setOcenka(int ocenka) {
		this.ocenka = ocenka;
	}

	@Override
	public String toString() {
		return "Ocenka [predmet=" + predmet + ", data=" + data + ", ocenka=" + ocenka + "]";
	}

}

