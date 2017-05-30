package qa.amishra.jackson.JsonPojoClasses;

/**
 * Created by Ashutosh on 30-05-2017.
 */
public class Contact
{
    private String ref;

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