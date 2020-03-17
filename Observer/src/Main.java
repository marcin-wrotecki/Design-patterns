import Implementations.Facebook;
import Implementations.User;

public class Main {

    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        User u1 = new User("Marcin");
        User u2 = new User("Ania");
        User u3 = new User("Krzysiu");

        facebook.sendNotification();
        facebook.addObserver(u1);
        facebook.sendNotification();

        facebook.addObserver(u2);
        facebook.sendNotification();

        facebook.deleteObserver(u1);
        facebook.addObserver(u3);
        facebook.sendNotification();

        facebook.addObserver(u1);
        facebook.sendNotification();
    }
}
