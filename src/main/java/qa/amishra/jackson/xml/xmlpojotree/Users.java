package qa.amishra.jackson.xml.xmlpojotree;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Users {

    public Users() {
    }

    public Users(String ref, String type) {
        this.ref = ref;
        this.type = type;
    }



    @JacksonXmlProperty(localName = "ref")
    private String ref;

    @JacksonXmlProperty(localName = "type")
    private String type;

    public String getRef ()
    {
        return ref;
    }

    public void setRef (String ref)
    {
        this.ref = ref;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ref = "+ref+", type = "+type+"]";
    }
}
