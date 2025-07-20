package notify;

public class Notification {
    private final int id = 1;
    private String message;
    private Priority priority;
    private static int nextId;

    public Notification () {
        this.message = "empty";
        this.priority = Priority.NORMAL;
    }
    public Notification (String message, Priority priority) {
        this.message = message;
        this.priority = priority;
    }

    public void send() {
        System.out.println("Уведомление: " + message + ", приоритет: " + priority);
    }
    public void send(String extra) {
        System.out.println("Уведомление: " + message + ", приоритет: " + priority + ", дополнительно: "+ extra);
    }
    @Override
    public String toString() {
        return "Уведомление {Сообщение = '" + message + "', приоритет = '" + priority + "}";
    }

    public int getId() {
        return id;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public Priority getPriority() {
        return priority;
    }
    public void setPriority (Priority priority) {
        this.priority = priority;
    }
    public int getNextId () {
        return nextId;
    }

    }
