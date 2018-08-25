package qa.amishra.jackson.xml.xmlpojotree;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Mobile
{
    public Mobile() {
    }

    public Mobile(Org org) {
        this.org = org;
    }

    @JacksonXmlProperty(localName = "org")
    private Org org;

    public Org getOrg ()
    {
        return org;
    }

    public void setOrg (Org org)
    {
        this.org = org;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [org = "+org+"]";
    }
}

