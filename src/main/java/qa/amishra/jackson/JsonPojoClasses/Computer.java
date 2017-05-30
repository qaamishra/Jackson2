package qa.amishra.jackson.JsonPojoClasses;

/**
 * Created by Ashutosh on 30-05-2017.
 */
public class Computer
{
    private String brand2;

    private String brand1;

    private String brand3;

    public String getBrand2 ()
    {
        return brand2;
    }

    public void setBrand2 (String brand2)
    {
        this.brand2 = brand2;
    }

    public String getBrand1 ()
    {
        return brand1;
    }

    public void setBrand1 (String brand1)
    {
        this.brand1 = brand1;
    }

    public String getBrand3 ()
    {
        return brand3;
    }

    public void setBrand3 (String brand3)
    {
        this.brand3 = brand3;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [brand2 = "+brand2+", brand1 = "+brand1+", brand3 = "+brand3+"]";
    }
}