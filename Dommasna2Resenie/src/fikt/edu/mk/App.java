package fikt.edu.mk;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Student student = new Student();
		student.setIme("Hristijan");
		student.setPrezime("Torkov");

		student.setOcenka(new Ocenka("Objektno orientirano programiranje", new Date(), 6));
		student.setOcenka(new Ocenka("Matematika", new Date(), 8));
		student.setOcenka(new Ocenka("Angliski", new Date(), 9));
		student.setOcenka(new Ocenka("Veb Dizajn", new Date(), 8));



		System.out.println(student);

		System.out.println(student.getProsek());
	}

}

