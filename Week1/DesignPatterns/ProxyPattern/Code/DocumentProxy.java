public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String fileName;

    public DocumentProxy(String fileName) {
        this.fileName = fileName;
    }

    public void displayContent() {
        if (realDocument == null) {
            realDocument = new RealDocument(fileName);
        }
        realDocument.displayContent();
    }
}
