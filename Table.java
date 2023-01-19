public class Table extends Furniture
{
    private String area;

    public Table (String name, double prize, String area) {
    // call the superclass constructor and pass the name and weight parameters
    super (name, prize);
    this.area = area;
    }

    @Override
    public String getColour()
    {
        // overriding the superclass method "getColour"
        return "Mahogani";
    }

    public String getArea()
    {
        return area;
    }

    public void setArea (String area)
    {
        this.area = area;
    }
}