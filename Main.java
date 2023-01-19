import java.util.*;

public class Main // #1 Main Program
{
	public static void main(String [] args) {
		Furniture furniture; // superclass object
		Chair chair = new Chair ("Bim Black", 5980, "Office"); // subclass object
		Table table = new Table ("Hermeyy", 10000, "Dining"); // another subclass object

		furniture = chair;
		// calling the accessors from the superclass object
		System.out.println("A customer bought " + furniture.getName() + ", a chair of " + furniture.getColour() + " color.");

		furniture = table;
		System.out.println("A customer bought " + furniture.getName() + ", a table of a " + furniture.getColour() + " color.");
	}
}
