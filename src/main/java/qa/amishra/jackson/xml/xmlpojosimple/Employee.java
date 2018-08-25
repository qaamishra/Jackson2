package qa.amishra.jackson.xml.xmlpojosimple;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Employee
{
    @JacksonXmlProperty(localName = "id", isAttribute = true)
    private String id;
    @JacksonXmlProperty(localName = "firstName")
    private String firstName;
    @JacksonXmlProperty(localName = "lastName")
    private String lastName;
    @JacksonXmlProperty(localName = "age")
    private int age;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge ()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", lastName = "+lastName+", age = "+age+", firstName = "+firstName+"]";
    }
}