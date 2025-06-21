public class MobileSubscriber implements Observer {
    private String phoneNumber;

    public MobileSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void update(String news) {
        System.out.println("SMS to " + phoneNumber + ": " + news);
    }
}
