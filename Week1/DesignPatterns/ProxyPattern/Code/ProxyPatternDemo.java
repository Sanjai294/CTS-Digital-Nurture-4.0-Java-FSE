public class ProxyPatternDemo {
    public static void main(String[] args) {
        Document doc = new DocumentProxy("DesignPatterns.pdf");

        System.out.println("Document created. Content not loaded yet.");

        System.out.println("\nFirst access:");
        doc.displayContent();

        System.out.println("\nSecond access:");
        doc.displayContent();
    }
}
