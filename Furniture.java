public abstract class Furniture
{
    protected String name; // #2 this is my superclass
    protected double prize; // attributes are protected

    // constructor
    public Furniture (String name, double prize) {
    this.name = name;
    this.prize = prize;
    }

    // this method will be overriden by the subclasses
    public abstract String getColour();

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize (double prize) {
        this.prize = prize;
    }
}