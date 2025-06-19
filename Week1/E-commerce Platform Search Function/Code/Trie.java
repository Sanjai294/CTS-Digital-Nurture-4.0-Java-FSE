import java.util.*;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            current.children.putIfAbsent(c, new TrieNode());
            current = current.children.get(c);
        }
        current.isEndOfWord = true;
        current.word = word; // Save the full word for output
    }

    public List<String> searchByPrefix(String prefix) {
        List<String> results = new ArrayList<>();
        TrieNode current = root;

        for (char c : prefix.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return results;
            }
            current = current.children.get(c);
        }

        dfs(current, results);
        return results;
    }

    private void dfs(TrieNode node, List<String> results) {
        if (node.isEndOfWord) {
            results.add(node.word);
        }

        for (char c : node.children.keySet()) {
            dfs(node.children.get(c), results);
        }
    }
}
