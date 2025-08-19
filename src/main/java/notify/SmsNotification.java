package notify;

public class SmsNotification extends Notification {

    private String number;

    public SmsNotification(String number) {
        super();
        this.number = number;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + number);
    }
}
