package notify;

import java.util.List;


public interface Sendable {
    void send();
    static void sendAll(List<? extends Sendable> sendables) {
        for (Sendable s : sendables) {
            s.send();
        }
    }
    default void sendWithLogging() {
        System.out.println("Начало отправки");
        send();
        System.out.println("Завершение отправки");
    }
}
