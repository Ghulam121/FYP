/**
 * 
 */
package fileReadings;

/**
 * @author abbas khan
 *
 */
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.StopAnalyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.TermAttribute;
import org.apache.lucene.util.Version;

public class LuceneTester {
	
   public static void main(String[] args) {
      LuceneTester tester;

      tester = new LuceneTester();
   
      try {
         tester.displayTokenUsingStopAnalyzer();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private void displayTokenUsingStopAnalyzer() throws IOException{
      String text 
         = "OMV Excellence Scholarships for doing Masters in Petroleum Engineering for students who are doing or have done Petroleum Engineering and will be eligible to start Masters in Fall 2017 at Montanuniversität Leoben, Austria ";
      Analyzer analyzer = new StopAnalyzer(Version.LUCENE_30,new File("D:\\eclipseProjects\\fileReadings\\stopwordslist.txt"));
    //  TokenStream tokenStream = analyzer.tokenStream(
      //   LuceneConstants.CONTENTS, new StringReader(text));
      TokenStream tokenStream = analyzer.tokenStream(text,new StringReader(text));
      TermAttribute term = tokenStream.addAttribute(TermAttribute.class);
      while(tokenStream.incrementToken()) {
         System.out.print("[" + term.term() + "] ");
      }
   }
}