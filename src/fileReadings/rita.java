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
import java.io.*;

public class rita {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		  RiWordNet rw = new RiWordNet("C:\\Users\\abbas khan\\Desktop\\dict"); // point to local installation
		  rw.randomizeResults(false);                   // don't randomize results
		  String[] s = rw.getPos("word");
		  System.out.println(Arrays.asList(s));
		  
		  FileReader fr = null;
		try {
			fr = new FileReader("D:\\eclipseProjects\\fileReadings\\stopwordslist.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String check = null;
		  BufferedReader breader = new BufferedReader(fr);
		  ArrayList ar = new ArrayList();
		  for(int i=0; i<429; i++){
			check = breader.readLine();
			ar.add(check);
		    }
		   System.out.println(ar.get(428));
	}
}

