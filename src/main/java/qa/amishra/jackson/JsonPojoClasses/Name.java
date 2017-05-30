package qa.amishra.jackson.JsonPojoClasses;

/**
 * Created by Ashutosh on 30-05-2017.
 */
public class Name
{
    private String last;

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