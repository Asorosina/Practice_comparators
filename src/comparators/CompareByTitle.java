/**
 * 
 */
package comparators;

import java.util.Comparator;

/**
 * @author angela
 *
 */
public class CompareByTitle implements Comparator<Book> {

	/**
	 * 
	 */
	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getTitle().compareTo(o2.getTitle());
	}

	

}
