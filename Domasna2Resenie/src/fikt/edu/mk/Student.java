package fikt.edu.mk;

import java.util.Arrays;

public class Student extends Covek {
	private static final int GRADES_LENGTH = 5;
	private Ocenka[] grades = new Ocenka[GRADES_LENGTH];

	public float getProsek() {
		float result = 0.0f;
		int count = 0;
		for (Ocenka grade : grades) {
			if (grade != null) {
				result += grade.getOcenka();
				count++;
			}
		}
		result /= count;
		return result;
	}

	public void setOcenka(Ocenka newOcenka) {
		int count = 0;
		for (Ocenka grade : grades) {
			if (grade != null) {
				count++;
				continue;
			}
			grades[count] = newOcenka;
			break;
		}
	}

	@Override
	public String toString() {
		return "Student [grades=" + Arrays.toString(grades) + ", getIme()=" + getIme() + ", getPrezime()="
				+ getPrezime() + "]";
	}

}
