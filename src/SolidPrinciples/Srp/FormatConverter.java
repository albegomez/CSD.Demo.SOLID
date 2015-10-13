package SolidPrinciples.Srp;

import SolidPrinciples.Base.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;


public class FormatConverter {

    private final DocumentStorage _documentStorage;
    private final InputParser _inputParser;
    private final DocumentSerializer _documentSerializer;

    public FormatConverter()
    {
        _documentStorage = new DocumentStorage();
        _inputParser = new InputParser();
        _documentSerializer = new DocumentSerializer();
    }

    public boolean ConvertFormat(String sourceFileName, String targetFileName) throws IOException, SAXException, ParserConfigurationException {
        try
        {
            File input = _documentStorage.GetData(sourceFileName);
            SolidPrinciples.Srp.Document doc = _inputParser.ParseInput(input);
            String serializedDoc = _documentSerializer.Serialize(doc);
            _documentStorage.PersistDocument(serializedDoc, targetFileName);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }
}
