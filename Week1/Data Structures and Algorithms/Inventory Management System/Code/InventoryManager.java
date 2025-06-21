import java.util.*;

public class InventoryManager {
    private Map<String, InventoryItem> inventory;
    private PriorityQueue<InventoryItem> lowStockQueue;

    public InventoryManager() {
        inventory = new HashMap<>();
        lowStockQueue = new PriorityQueue<>(Comparator.comparingInt(InventoryItem::getQuantity));
    }

    public void addItem(String id, String name, int quantity, double price) {
        InventoryItem item = new InventoryItem(id, name, quantity, price);
        inventory.put(id, item);
        lowStockQueue.offer(item);
    }

    public void updateQuantity(String id, int quantity) {
        InventoryItem item = inventory.get(id);
        if (item != null) {
            item.setQuantity(quantity);
        }
    }

    public void updatePrice(String id, double price) {
        InventoryItem item = inventory.get(id);
        if (item != null) {
            item.setPrice(price);
        }
    }

    public void removeItem(String id) {
        InventoryItem item = inventory.remove(id);
        if (item != null) {
            lowStockQueue.remove(item);
        }
    }

    public InventoryItem searchItem(String id) {
        return inventory.get(id);
    }

    public List<InventoryItem> getLowStockItems(int threshold) {
        List<InventoryItem> result = new ArrayList<>();
        for (InventoryItem item : inventory.values()) {
            if (item.getQuantity() < threshold) {
                result.add(item);
            }
        }
        return result;
    }

    public List<InventoryItem> getAllItems() {
        return new ArrayList<>(inventory.values());
    }
}
