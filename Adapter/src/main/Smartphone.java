package main;

public class Smartphone implements ISmartPhone {


    @Override
    public void setPhoto(String img) {
        System.out.println("Photo was set");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Call: "+number);
    }

    @Override
    public void takePhotoButBetter(String choosenFilter) {
        System.out.println("I have taken a photo with filter");
    }

    @Override
    public String getSpecification() {
        return "I am new phone!";
    }

    @Override
    public String getContants() {
        return "You don't have any contacts";
    }
}
