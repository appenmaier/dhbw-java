package demos.movie.v1;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoX {

	private static Movie movie1 = new Movie("The Avengers", Genre.FANTASY, "2012", 8.0);
	private static Movie movie2 = new Movie("The Matrix", Genre.SCIENCE_FICTION, "1999", 8.7);
	private static Movie movie3 = new Movie("Atomic Hero", Genre.HORROR, "1984", 6.2);

//	private static Movie[] movies = new Movie[5];
	private static ArrayList<Movie> movies = new ArrayList<>();

	public static void main(String[] args) {

//		movies[0] = movie1;
//		movies[1] = movie2;
//		movies[2] = movie3;
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);

		addMoviesByConsole();

		compareMovies();

//		for (int i = 0; i < movies.length; i++) {
//			System.out.println(movies[i].getTitle());
//		}
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i).toString());
		}

	}

	private static void addMoviesByConsole() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Eingabe beenden (true, false)?: ");
			boolean answer = scanner.nextBoolean();
			if (answer) { // if (answer == true) {
				break;
			}

			scanner.nextLine();
			System.out.print("Bitte Titel eingeben: ");
			String title = scanner.nextLine();
			System.out.print("Bitte Genre eingeben: ");
			String genreText = scanner.nextLine();
			System.out.print("Bitte Erscheinungsjahr eingeben: ");
			String publishingYear = scanner.nextLine();
			System.out.print("Bitte Bewertung eingeben: ");
			double rating = scanner.nextDouble();

			Movie movie = new Movie(title, Genre.valueOf(genreText), publishingYear, rating);
			movies.add(movie);
		}
//		char x = scanner.next().charAt(0);
//		double d = Double.valueOf("5.5");
	}

	private static void compareMovies() {
		Movie movie1 = new Movie("Film A", Genre.DRAMA, "2022", 9.9);
		Movie movie2 = new Movie("Film A", Genre.DRAMA, "2022", 9.9);

		System.out.println("movie1.hashCode(): " + movie1.hashCode());
		System.out.println("movie2.hashCode(): " + movie2.hashCode());

		if (movie1 == movie2) {
			System.out.println("Die beiden Objekte sind identisch");
		}

		if (movie1.equals(movie2)) {
			System.out.println("Die beiden Objekte sind gleich");
		}

	}

}
