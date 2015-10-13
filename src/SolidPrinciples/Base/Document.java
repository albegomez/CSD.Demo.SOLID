package SolidPrinciples.Base;

/**
 * Created by Alberto on 13/10/15.
 */
public class Document {

    private String title;
    private String text;
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setText(String text)
    {
        this.text = text;
    }
    public String getText()
    {
        return text;
    }

    public String getTitle()
    {
        return title;
    }

}
