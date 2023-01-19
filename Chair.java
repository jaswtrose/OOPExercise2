public class Chair extends Furniture // #3 subclass of Furniture superclass
{
    private String setting;

    public Chair (String name, double prize, String setting) {
    // call the superclass constructor and pass the name and prize parameters
    super (name, prize);
    this.setting = setting;
    }

    @Override
    public String getColour()
    {
        //overriding the superclass method "getColour"
        return "White";
    }

    public String getSetting()
    {
        return setting;
    }

    public void setSetting (String setting)
    {
        this.setting = setting;
    }
}