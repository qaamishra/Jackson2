package qa.amishra.jackson.xml.xmlpojotree;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Elements
{
    public Elements() {
    }

    public Elements(Computer computer, Mobile mobile) {
        this.computer = computer;
        this.mobile = mobile;
    }

    @JacksonXmlProperty(localName = "computer")
    private Computer computer;

    @JacksonXmlProperty(localName = "mobile")
    private Mobile mobile;

    public Computer getComputer ()
    {
        return computer;
    }

    public void setComputer (Computer computer)
    {
        this.computer = computer;
    }

    public Mobile getMobile ()
    {
        return mobile;
    }

    public void setMobile (Mobile mobile)
    {
        this.mobile = mobile;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [computer = "+computer+", mobile = "+mobile+"]";
    }
}