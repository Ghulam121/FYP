/**
 * 
 */
package fileReadings;

/**
 * @author abbas khan
 *
 */
import com.itextpdf.text.pdf.PdfReader;

import java.io.*;

import com.itextpdf.text.pdf.parser.PdfTextExtractor;
class preprocessing{

	public void removestopwords(String content){
		System.out.println("Content of file"+" "+content);
	}
	
}
public class pdfReader {

	/**
	 * @param args
	 * 
	 */
	public static void main(String args[]){
		String pageContent=null;
		try {
		//Create PdfReader instance.
		PdfReader pdfReader = new PdfReader("d:\\teek.pdf");	//here give the full path to your file
	 
		//Get the number of pages in pdf.
		int pages = pdfReader.getNumberOfPages(); 
	  
		System.out.println(pages);
		
		//Iterate the pdf through pages.
		for(int i=1; i<=2; i++) { 
		  //Extract the page content using PdfTextExtractor.
		   pageContent = 
		  	PdfTextExtractor.getTextFromPage(pdfReader, i);
	 
		  //Print the page content on console.
		  //System.out.println("Content on Page "
		  //		              + i + ": " + pageContent);
	      }
		BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(pageContent);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( output != null ) {
            output.close();
          }
        }
		
		preprocessing pre = new preprocessing();
		//pre.removestopwords(pageContent);
	      //Close the PdfReader.
	      pdfReader.close();
	    } 
	catch (Exception e) {
		e.printStackTrace();
	    }
	}

}

