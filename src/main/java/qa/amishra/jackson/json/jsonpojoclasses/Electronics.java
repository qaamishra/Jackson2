package qa.amishra.jackson.json.jsonpojoclasses;

import qa.amishra.jackson.json.jsonpojoclasses.*;


/**
 * Created by Ashutosh on 30-05-2017.
 */
public class Electronics
{
    private Computer[] computer;



    private Mobile[] mobile;

    public Computer[] getComputer ()
    {
        return computer;
    }

    public void setComputer (Computer[] computer)
    {
        this.computer = computer;
    }

    public Mobile[] getMobile ()
    {
        return mobile;
    }

    public void setMobile (Mobile[] mobile)
    {
        this.mobile = mobile;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [computer = "+computer+", mobile = "+mobile+"]";
    }
}