package Week1_design_principles_patterns.Exercise_1_Singleton_Pattern.Code;

public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern() {
        System.out.println("Singleton instance created.");
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hii from Singleton!");
    }

    public static void main(String[] args) {
        SingletonPattern obj = SingletonPattern.getInstance();
        obj.showMessage();
    }
}
