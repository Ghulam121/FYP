/**
 * 
 */
package fileReadings;

/**
 * @author abbas khan
 *
 */

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
public class ExtractMetadata {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document doc;
		try {

			// need http protocol
			doc = Jsoup.connect("https://github.com/Ghulam121/FYP").get();
			//Document doc = Jsoup.parse("https://jsoup.org/cookbook/introduction/parsing-a-document");
			// get page title
			String description = doc.select("meta[name=description]").get(0) .attr("content"); 
			//Print description.
			System.out.println("Meta Description: " + description); 
			//Get keywords from document object.
			if(doc.select("meta[name=keywords]").first() .attr("content")==null){}
			String keywords = doc.select("meta[name=keywords]").first() .attr("content"); 
			//Print keywords
			if(keywords.isEmpty()){
				System.out.println("no Key words found");
			} 
			else{
			System.out.println("Meta Keyword : " + keywords);
			}
		   //tutorialspointexamples.com/jsoup-get-metadata-from-html-example/#sthash.0DbRatkE.dpuf

		} catch (IOException e) {
			e.printStackTrace();
		}

	  }
	

}
