package SolidPrinciples.Srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Alberto on 13/10/15.
 */
public class DocumentStorage {

    public File GetData(String fileName)
    {
        return new File(fileName);
    }

    public void PersistDocument(String serializedDocument, String targetFileName) throws IOException
    {
        //write converted json data to a file named "file.json"
        FileWriter writer = new FileWriter(targetFileName);
        writer.write(serializedDocument);
        writer.close();
    }
}
