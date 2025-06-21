public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer emailSubscriber = new EmailSubscriber("john@example.com");
        Observer mobileSubscriber = new MobileSubscriber("9876543210");

        agency.attach(emailSubscriber);
        agency.attach(mobileSubscriber);

        agency.setNews("Breaking: Observer Pattern Implemented Successfully!");

        agency.detach(emailSubscriber);
        agency.setNews("Update: Email Subscriber unsubscribed.");
    }
}
