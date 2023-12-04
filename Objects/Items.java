package items;

public class Items {
    String itemNumber;
    String itemDescription;
    double Unitprice;
    int quantity;

public Items (String itemNumber, String itemDescription, double Unitprice, int quantity) {
    this.itemNumber = itemNumber;
    this.itemDescription = itemDescription;
    this.Unitprice = Unitprice;
    this.quantity = quantity;
}
void DisplayItemInfo(){
    System.out.println("Item Number: " + itemNumber);
    System.out.println("Item Description: " + itemDescription);
    System.out.println("Unit Price: " + Unitprice);
    System.out.println("Quantity on Hand: " + quantity);
}
void ComputeInventory(int quantity, double price) {
    double inventory = (quantity * price);
    System.out.println("Inventory: " + inventory );
}

    public static void main(String[] args) {
         Items i = new Items ("#1", "Tinnypiens", 1500.00, 100);

         i.DisplayItemInfo();
         i.ComputeInventory(2, 1000.00);
    }
    
}
