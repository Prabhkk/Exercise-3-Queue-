import java.util.LinkedList;
import java.util.Queue;

class CoffeeOrder {
    String customerName;
    String drinkType;
    String size;

    public CoffeeOrder(String customerName, String drinkType, String size) {
        this.customerName = customerName;
        this.drinkType = drinkType;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + ", Drink: " + drinkType + ", Size: " + size;
    }
}
