package notify;

public class SmsNotification extends Notification {
    private String number;

    public SmsNotification(String number, String message) {
        super(message, Priority.LOW);
        this.number = number;
    }

    @Override
    public void send() {
        System.out.println("Sending number to " + number);
        super.send();
    }
}
