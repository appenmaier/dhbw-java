package exercises.java;

/**
 * Uebungsaufgabe JAVA-15
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Loops01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}

	}

}
