package notify;

import java.util.*;

public class NotificationManager<T extends Notification> {
    private final List<T> allNotif = new ArrayList<>();
    private final Map<Priority, List<T>> notifByPriority = new HashMap<>();

    public void add(T notification) {
        if (allNotif.stream().enyMatch(T f -> f.getId() == notification.getId())) {
            throw new RuntimeException();
        }
        allNotif.add(notification);

        Priority priority = notification.getPriority();
        List<T> priorityList = notifByPriority.get(priority);
        if (priorityList == null) {
            notifByPriority.put(priority, new ArrayList<>());
        }
        priorityList.add(notification);
    }
    public Optional<T> find(int id) {
        return allNotif.stream().filter(T f -> f.getId() == id).findFirst();
    }

    public List<T> get(Priority p) {
        List<T> list = notifByPriority.get(p);
        if (list == null) {
            return Collection.emptyList();
        }
        return new ArrayList<>(list);
    }

    public void sendAll() {
        Sendable.sendAll(allNotif);
    }
}