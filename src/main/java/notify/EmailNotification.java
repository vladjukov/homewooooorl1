package notify;

public class EmailNotification extends Notification {

    private String email;

    public EmailNotification(String email) {
        super("email message", Priority.LOW);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void send() {
        System.out.println("Sending e-mail to " + email);
    }

}
