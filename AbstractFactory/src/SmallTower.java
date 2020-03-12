public class SmallTower extends Tower {

    public SmallTower(User user){
        name=smallTower;
        System.out.println(name+" was created!");
        user.addTower(name);
    }
}
