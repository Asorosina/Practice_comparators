/**
 * 
 */
package comparators;

import java.util.Comparator;

/**
 * @author angela
 *
 */
public class CompareByRating implements Comparator<Book>{

	/**
	 * 
	 */
	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getRating() - o2.getRating();
	}

}
