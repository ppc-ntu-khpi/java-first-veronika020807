public class Quotation {
    public double calculateTotalPrice(Shirt shirt) {
        return shirt.price * shirt.quantityInStock;
    }

    public void displayQuotation(Shirt shirt) {
        System.out.println("=== Quotation ===");
        shirt.displayShirtInformation();
        System.out.println("Total stock value: $" + calculateTotalPrice(shirt));
    }
}
