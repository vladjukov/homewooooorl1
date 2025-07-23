package notify;

public class EmailNotification extends Notification {
    private final String email;

    public EmailNotification(String email, String message) {
        super(message, Priority.HIGH);
        this.email = email;
    }

    @Override
    public void send() {
        System.out.println("Sending e-mail to " + email);
        super.send();
    }

}
