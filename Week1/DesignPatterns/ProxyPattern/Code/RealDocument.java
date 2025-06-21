public class RealDocument implements Document {
    private String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading document from disk: " + fileName);
    }

    public void displayContent() {
        System.out.println("Displaying content of: " + fileName);
    }
}
