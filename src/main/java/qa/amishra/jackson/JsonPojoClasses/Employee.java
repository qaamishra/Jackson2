package qa.amishra.jackson.JsonPojoClasses;

/**
 * Created by Ashutosh on 30-05-2017.
 */
public class Employee
{
    private String id;

    private Name name;

    private Contact[] contact;

    private Electronics[] electronics;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Name getName ()
    {
        return name;
    }

    public void setName (Name name)
    {
        this.name = name;
    }

    public Contact[] getContact ()
    {
        return contact;
    }

    public void setContact (Contact[] contact)
    {
        this.contact = contact;
    }

    public Electronics[] getElectronics ()
    {
        return electronics;
    }

    public void setElectronics (Electronics[] electronics)
    {
        this.electronics = electronics;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", name = "+name+", contact = "+contact+", electronics = "+electronics+"]";
    }
}
