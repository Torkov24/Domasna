package fikt.edu.mk;

public class Covek {
	private String ime;
	private String prezime;

	public Covek() {
		super();
	}

	public Covek(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "Person [ime=" + ime + ", prezime=" + prezime + "]";
	}

}
