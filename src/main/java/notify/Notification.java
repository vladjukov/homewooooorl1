package notify;

public class Notification {
    private final int id;
    private String message;
    private Priority priority;
    private static int nextId = 1;

    public Notification() {
        this("empty", Priority.NORMAL);
    }

    public Notification(String message, Priority priority) {
        this.id = nextId++;
        this.message = message;
        this.priority = priority;
    }

    public void send() {
        System.out.println(this);
    }

    public void send(String extra) {
        System.out.println(this + ", дополнительно: " + extra);
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

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
