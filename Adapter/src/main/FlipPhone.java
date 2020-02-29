package main;

public class FlipPhone implements IFlipPhone {
    @Override
    public void makeCall(String number) {
        System.out.println("Call: "+number);
    }

    @Override
    public void takePhoto() {
        System.out.println("I have taken a photo");

    }

    @Override
    public String getSpecification() {
        return "I am old phone";
    }

    @Override
    public String getContants() {
        return "You don't have any contacts";
    }
}
