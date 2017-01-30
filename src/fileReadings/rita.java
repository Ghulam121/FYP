/**
 * 
 */
package fileReadings;

/**
 * @author abbas khan
 *
 */

import rita.*;
import java.util.*;
public class rita {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  RiWordNet rw = new RiWordNet("C:\\Users\\abbas khan\\Desktop\\dict"); // point to local installation
		  rw.randomizeResults(false);                   // don't randomize results
		  String[] s = rw.getStems("wrote", "v");
		  System.out.println(Arrays.asList(s));
	}

}
