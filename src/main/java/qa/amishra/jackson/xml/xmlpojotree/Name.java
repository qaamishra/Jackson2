package qa.amishra.jackson.xml.xmlpojotree;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Name
{
    public Name() {
    }

    public Name(String last, String first) {
        this.last = last;
        this.first = first;
    }

    @JacksonXmlProperty(localName = "last")
    private String last;
    @JacksonXmlProperty(localName = "first")
    private String first;

    public String getLast ()
    {
        return last;
    }

    public void setLast (String last)
    {
        this.last = last;
    }

    public String getFirst ()
    {
        return first;
    }

    public void setFirst (String first)
    {
        this.first = first;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [last = "+last+", first = "+first+"]";
    }
}
