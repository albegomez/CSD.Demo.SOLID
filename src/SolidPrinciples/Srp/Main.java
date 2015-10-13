package SolidPrinciples.Srp;

import com.google.gson.Gson;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

            String current    = new File( "." ).getCanonicalPath();
            String sourceFileName  = current + "/Input Documents/Document1.xml";
            String targetFileName = current + "/Output Documents/Document1.json";

            FormatConverter formatConverter = new FormatConverter();
            if (!formatConverter.ConvertFormat(sourceFileName, targetFileName)) {
                System.out.println("Conversion failed...");
            }
            else
                System.out.println("Conversion done...");
    }










}
