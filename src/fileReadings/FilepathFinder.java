/**
 * 
 */
package fileReadings;

import java.io.File;

/**
 * @author abbas khan
 *
 */
public class FilepathFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.docx");
		String path = file.getAbsolutePath();
		System.out.println(path);

	}

}
