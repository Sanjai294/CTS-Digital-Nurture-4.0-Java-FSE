public class InventorySystem {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addItem("P001", "SolarCell Panel", 10, 1250.75);
        manager.addItem("P002", "Voltage Regulator", 4, 320.50);
        manager.addItem("P003", "InverterModule", 6, 2100.00);
        manager.addItem("P004", "Battery Pack", 2, 840.00);

        System.out.println("Current Inventory:");
        for (InventoryItem item : manager.getAllItems()) {
            System.out.println(item);
        }

        System.out.println("\nLow Stock Items (less than 5):");
        for (InventoryItem item : manager.getLowStockItems(5)) {
            System.out.println(item);
        }

        System.out.println("\nUpdating quantity of P004 to 8");
        manager.updateQuantity("P004", 8);

        System.out.println("\nInventory after update:");
        for (InventoryItem item : manager.getAllItems()) {
            System.out.println(item);
        }

        System.out.println("\nSearching for P003:");
        InventoryItem found = manager.searchItem("P003");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Item not found.");
        }

        System.out.println("\nRemoving item P002");
        manager.removeItem("P002");

        System.out.println("\nInventory after removal:");
        for (InventoryItem item : manager.getAllItems()) {
            System.out.println(item);
        }
    }
}
