import java.util.ArrayList;
import java.util.Random;

public class User implements ITowerName {

    private ArrayList<Tower> towersList;
    private int numberOfSmallTowers=0;
    private int numberOfMediumTowers=0;
    private int numberOfBigTowers=0;
    private int gold;

    public User(int gold){
        towersList= new ArrayList<>();
        this.gold=gold;
    }

    public ArrayList<Tower> getTowersList(){
        return towersList;
    }

    public void getNumberOfTowers(){
        System.out.println("You have: ");
        System.out.println(getNumberOfSmallTowers()+" small towers");
        System.out.println(getNumberOfMediumTowers()+" medium towers");
        System.out.println(getNumberOfBigTowers()+" big towers");
    }

    public int getNumberOfSmallTowers() {
        return numberOfSmallTowers;
    }

    public int getNumberOfMediumTowers() {
        return numberOfMediumTowers;
    }

    public int getNumberOfBigTowers() {
        return numberOfBigTowers;
    }

    public void addTower(String kindOfTower){
        if(kindOfTower.equals(smallTower)){
            numberOfSmallTowers++;
        }
        else if (kindOfTower.equals(mediumTower)){
            numberOfMediumTowers++;
        }
        else if(kindOfTower.equals(bigTower)){
            numberOfBigTowers++;
        }
    }
    public boolean buyTower(int price){
        int result=gold-price;
        if((result)>=0){
            System.out.println("You have bought tower!");
            gold=result;
            return true;
        }
        else {
            System.out.println("You don't have enough gold");
            return false;
        }

    }
    public int getGold() {
        return gold;
    }
    public void fight(){
        System.out.println("You are fighting!");
        Random rand = new Random();
        double chanceToWin=0.01*numberOfSmallTowers+0.021*numberOfMediumTowers+0.031*numberOfBigTowers;
        if(chanceToWin>(rand.nextDouble())) {
            System.out.println("You won!");
            gold+=200;
        }
        else{
            System.out.println("You lose");
            numberOfSmallTowers=0;
            numberOfMediumTowers=0;
            numberOfBigTowers=0;
            towersList.clear();
        }
    }


}
