package notify;

public class Demo {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[]{
                new EmailNotification("email", "emailMessage"),
                new SmsNotification("+79187687655", "smsMessage")
        };
        for (Notification notification : notifications) {
            notification.send();
            System.out.println();
        }
        System.out.println("Кол-во уведомлений: " + notifications.length);
    }
}
