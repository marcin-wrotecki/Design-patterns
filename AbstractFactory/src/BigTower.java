public class BigTower extends Tower {
    public BigTower(User user){
        name= bigTower;
        System.out.println(name+" was created!");
        user.addTower(name);
    }
}
