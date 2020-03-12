public class AbstractFactory implements ITowerName{
    private final static AbstractFactory abstractFactory=new AbstractFactory();

    private AbstractFactory(){

    }

    public static AbstractFactory getInstance(){

        return abstractFactory;
    }

    public Tower getTower(User user, String kindOfTower){
        if(kindOfTower.equals(smallTower)){
                return new SmallTower(user);
        }
        else if(kindOfTower.equals(mediumTower)){
                return new MediumTower(user);
        }
        else if(kindOfTower.equals(bigTower)){
                return new BigTower(user);
        }
        else
            System.out.println("Can't create tower");

        return null;

    }
}
