package main;

public class Adapter implements IFlipPhone, ISmartPhone{
    private Smartphone smartphone = new Smartphone();


    @Override
    public void setPhoto(String img) {
        smartphone.setPhoto(img);
    }

    @Override
    public void makeCall(String number) {
        smartphone.makeCall(number);
    }

    @Override
    public void takePhotoButBetter(String choosenFilter) {
            smartphone.takePhotoButBetter(choosenFilter);
    }

    @Override
    public void takePhoto() {
            smartphone.takePhotoButBetter(null);
    }

    @Override
    public String getSpecification() {
        return smartphone.getSpecification();
    }

    @Override
    public String getContants() {
        return smartphone.getContants();
    }
}
