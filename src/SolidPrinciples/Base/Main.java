package SolidPrinciples.Base;

import com.google.gson.Gson;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        try {
            String current    = new java.io.File( "." ).getCanonicalPath();
            String inputFile  = current + "/Input Documents/Document1.xml";
            String outputFile = current + "/Output Documents/Document1.json";
            SolidPrinciples.Base.Document document = new SolidPrinciples.Base.Document();

            File xmlFile = new File(inputFile);

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("document");

            Node nNode = nList.item(0);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE)
            {
                Element eElement = (Element) nNode;
                document.setTitle(eElement.getElementsByTagName("title").item(0).getTextContent());
                document.setText( eElement.getElementsByTagName("text").item(0).getTextContent());
            }

            Gson gsonParser= new Gson();
            String json = gsonParser.toJson(document);


            try {
                //write converted json data to a file named "file.json"
                FileWriter writer = new FileWriter(outputFile);
                writer.write(json);
                writer.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}
