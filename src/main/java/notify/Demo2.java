package notify;

public class Demo2 {
    public static void main(String[] args) {
        NotificationManager<SmsNotification> sms = new NotificationManager<>();
        NotificationManager<EmailNotification> email = new NotificationManager<>();
        NotificationManager<Notification> allNot = new NotificationManager<>();


        SmsNotification smsNotification = new SmsNotification("+2123214");
        EmailNotification email = new EmailNotification("efsdfs");
        sms.add(smsNotification);

    }
}
