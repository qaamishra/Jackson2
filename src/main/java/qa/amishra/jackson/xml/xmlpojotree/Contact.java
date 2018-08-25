package qa.amishra.jackson.xml.xmlpojotree;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Contact
{
    public Contact() {
    }

    public Contact(Users[] users) {

        this.users = users;
    }

    //Collections
    @JacksonXmlElementWrapper(localName = "elements", useWrapping = false)
    private Users[] users;

    public Users[] getUsers ()
    {
        return users;
    }

    public void setUsers (Users[] users)
    {
        this.users = users;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [users = "+users+"]";
    }
}