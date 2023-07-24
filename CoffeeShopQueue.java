import java.util.LinkedList;
import java.util.Queue;
class CoffeeShopQueue {
    private Queue<CoffeeOrder> queue;

    public CoffeeShopQueue() {
        queue = new LinkedList<>();
    }

    public void addOrder(CoffeeOrder order) {
        queue.add(order);
    }

    public CoffeeOrder removeOrder() {
        return queue.poll();
    }

    public CoffeeOrder peekNextOrder() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
