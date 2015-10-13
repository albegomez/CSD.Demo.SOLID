package SolidPrinciples.Srp;

import com.google.gson.Gson;

/**
 * Created by Alberto on 13/10/15.
 */
public class DocumentSerializer
{
    public String Serialize(SolidPrinciples.Srp.Document document) {
        Gson gsonParser= new Gson();
        return gsonParser.toJson(document);
    }
}
