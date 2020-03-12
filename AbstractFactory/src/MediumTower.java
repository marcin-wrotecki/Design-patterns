public class MediumTower extends Tower {


    public MediumTower(User user){
        name=mediumTower;
        System.out.println(name+" was created!");

        user.addTower(name);
    }
}
