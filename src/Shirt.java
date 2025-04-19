public class Shirt {
    public int shirtID = 101;
    public String description = "Summer cotton shirt";
    public char colorCode = 'B';
    public double price = 29.99;
    public int quantityInStock = 50;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
