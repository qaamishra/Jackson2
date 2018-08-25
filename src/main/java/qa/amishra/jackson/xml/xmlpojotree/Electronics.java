package qa.amishra.jackson.xml.xmlpojotree;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Electronics
{
    public Electronics() {
    }

    public Electronics(Elements elements) {

        this.elements = elements;
    }

    @JacksonXmlProperty(localName = "elements")
    private Elements elements;

    public Elements getElements ()
    {
        return elements;
    }

    public void setElements (Elements elements)
    {
        this.elements = elements;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [elements = "+elements+"]";
    }
}