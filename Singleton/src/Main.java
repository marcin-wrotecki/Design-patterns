public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.name="First";
        s2.name="Second";
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
