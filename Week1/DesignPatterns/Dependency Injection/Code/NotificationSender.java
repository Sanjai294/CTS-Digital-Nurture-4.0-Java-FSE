public class NotificationSender {
    private MessageService messageService;

    public NotificationSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}
