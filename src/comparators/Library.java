/**
 * 
 */
package comparators;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author angela
 *
 */
public class Library {

	/**
	 * 
	 */
	public Library() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub//exercise to practice comparators

		// create book objects
		Book b1 = new Book("ISBNnumber", "author", "e", 3);
		Book b2 = new Book("ISBNnumber", "author", "c", 5);
		Book b3 = new Book("ISBNnumber", "author", "b", 4);
		Book b4 = new Book("ISBNnumber", "author", "d", 2);
		Book b5 = new Book("ISBNnumber", "author", "a", 1);

		// put books in ArrayList
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);

		// order books by title

		Collections.sort(books, new CompareByTitle());
		showAll(books);

		// order books by rating
		Collections.sort(books, new CompareByRating());
		showAll(books);
	}

	private static void showAll(ArrayList<Book> books) {
		for (int loop = 0; loop < books.size(); loop++) {
			System.out.println(books.get(loop).toString());
		}
		System.out.println();


	}

	
	
	

}
