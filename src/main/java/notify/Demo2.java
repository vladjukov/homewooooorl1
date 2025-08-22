package notify;

import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        NotificationManager<Notification> allNot = new NotificationManager<>();
        NotificationManager<SmsNotification> sms = new NotificationManager<>();
        NotificationManager<EmailNotification> email = new NotificationManager<>();



        SmsNotification smsNotification1 = new SmsNotification("+2123214");
        SmsNotification smsNotification2 = new SmsNotification("+234783");
        EmailNotification emailNotification1 = new EmailNotification("efsdfs@mail.com");
        EmailNotification emailNotification2 = new EmailNotification("uybrre@mail.com");

        try {
            allNot.add(emailNotification1);
            allNot.add(smsNotification1);
            allNot.add(emailNotification2);
            allNot.add(smsNotification2);

            sms.add(smsNotification1);
            sms.add(smsNotification2);

            email.add(emailNotification1);
            email.add(emailNotification2);

            System.out.println("Добавляем дубликат emailNotification1 в allNot...");
            allNot.add(emailNotification1);
        } catch (DuplicateIdException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\nУведомление высокого приоритета:");
        List<Notification> highPriority = allNot.get(Priority.HIGH);
        highPriority.forEach(n -> System.out.println(n));

        int findId = smsNotification1.getId();
        System.out.println("\nПоиск уведомления с id = " + findId);
        Optional<Notification> found = allNot.find(findId);

        if (found.isPresent()) {
            Notification notification = found.get();
            System.out.println("Найдено: " + notification);
            System.out.println("Отправляем уведомление:");
            notification.send();
            System.out.println("Отправляем с логированием:");
            notification.sendWithLogging();
        } else {
            System.out.println("Уведомление с id = " + findId + " не найдено");
        }

        System.out.println("\nОтправка всех уведомлений:");
        allNot.sendAll();
    }
}
