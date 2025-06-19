import java.util.*;

public class ProductSearch {
    public static void main(String[] args) {
        Trie trie = new Trie();
        List<String> products = Arrays.asList("iPhone", "iPad", "iMac", "AirPods", "Apple Watch");

        for (String product : products) {
            trie.insert(product);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Search for product: ");
        String prefix = scanner.nextLine();

        List<String> results = trie.searchByPrefix(prefix);

        if (results.isEmpty()) {
            System.out.println("No matching products found.");
        } else {
            System.out.println("Products found:");
            for (String product : results) {
                System.out.println("- " + product);
            }
        }
    }
}
