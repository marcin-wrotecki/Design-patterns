package main;

public class Main {

    public static void main(String[] args) {
        Adapter phone = new Adapter();
        System.out.println(phone.getSpecification());
        System.out.println(phone.getContants());
        phone.takePhoto();
        phone.takePhotoButBetter("Black-white");
        phone.makeCall("123456789");
        phone.setPhoto("My photo");
    }
}
