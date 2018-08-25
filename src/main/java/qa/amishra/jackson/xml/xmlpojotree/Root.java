package qa.amishra.jackson.xml.xmlpojotree;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "root")
public class Root
{
    public Root() {
    }

    public Root(Name name, Contact contact, Electronics electronics) {
        this.name = name;
        this.contact = contact;
        this.electronics = electronics;
    }

    @JacksonXmlProperty(localName = "name")
    private Name name;

    @JacksonXmlProperty(localName = "contact")
    private Contact contact;

    @JacksonXmlProperty(localName = "electronics")
    private Electronics electronics;

    public Name getName ()
    {
        return name;
    }

    public void setName (Name name)
    {
        this.name = name;
    }

    public Contact getContact ()
    {
        return contact;
    }

    public void setContact (Contact contact)
    {
        this.contact = contact;
    }

    public Electronics getElectronics ()
    {
        return electronics;
    }

    public void setElectronics (Electronics electronics)
    {
        this.electronics = electronics;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", contact = "+contact+", electronics = "+electronics+"]";
    }
}