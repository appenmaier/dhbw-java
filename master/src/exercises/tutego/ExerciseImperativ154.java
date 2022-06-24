package exercises.tutego;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.5.4
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ154 {

	public static void main(String[] args) {

		double t = Math.random() * 10;

		while (t > 0) {
			if (t < 1) {
				t *= 2;
			} else {
				t--;
			}
			System.out.println(t);
		}

	}

}
