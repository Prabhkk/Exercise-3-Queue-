public class Main {
    public static void main(String[] args) {
        CoffeeShopQueue coffeeQueue = new CoffeeShopQueue();

        // Adding orders to the queue
        CoffeeOrder order1 = new CoffeeOrder("John", "Cappuccino", "Medium");
        CoffeeOrder order2 = new CoffeeOrder("Emma", "Espresso", "Small");
        CoffeeOrder order3 = new CoffeeOrder("Michael", "Latte", "Large");

        coffeeQueue.addOrder(order1);
        coffeeQueue.addOrder(order2);
        coffeeQueue.addOrder(order3);

        // Printing the next order without removing it
        CoffeeOrder nextOrder = coffeeQueue.peekNextOrder();
        System.out.println("Next order in the queue: " + nextOrder);

        // Removing the next order from the queue
        CoffeeOrder removedOrder = coffeeQueue.removeOrder();
        System.out.println("Removed order: " + removedOrder);

        // Printing the next order again after removal
        nextOrder = coffeeQueue.peekNextOrder();
        System.out.println("Next order in the queue: " + nextOrder);

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + coffeeQueue.isEmpty());
    }
}
