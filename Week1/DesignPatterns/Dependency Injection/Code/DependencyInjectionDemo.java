public class DependencyInjectionDemo {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        NotificationSender emailSender = new NotificationSender(emailService);
        emailSender.notifyUser("Meeting at 3 PM", "john@example.com");

        MessageService smsService = new SMSService();
        NotificationSender smsSender = new NotificationSender(smsService);
        smsSender.notifyUser("Your OTP is 123456", "9876543210");
    }
}
