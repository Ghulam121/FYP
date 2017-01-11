/**
 * 
 */
package fileReadings;

/**
 * @author abbas khan
 *
 */
import java.io.*;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;

public class reading
{
    public static void main(String[] args) 
    {
        File file = null;
        XWPFWordExtractor extractor = null;
        try
        {

            file = new File("d://test.docx");    //here give the full path to your file     
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            XWPFDocument document = new XWPFDocument(fis);
            extractor = new XWPFWordExtractor(document);
            String fileData = extractor.getText();
            //for (int i = 0; i < fileData.length; i++)
           // {
            //    if (fileData[i] != null)
                    System.out.println(fileData);
            //}
        }
        catch (Exception exep)
        {
            //exep.printStackTrace();
        }
    }
}
