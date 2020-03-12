import javax.sound.midi.Soundbank;
import java.util.*;

public class Main implements ITowerName{

    private static AbstractFactory abstractFactory=AbstractFactory.getInstance();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User(100);
        int option;
        while(true){
            System.out.format("You have %d gold!\n",user.getGold());
            showMenu();
            try{
                option=sc.nextInt();
                if(option>0 && option<6)
                    buildTower(user,option);
                else if(option==6) {
                    break;
                }
                else
                    System.out.println("You have choosen a wrong option");

            }catch(NumberFormatException e){
                System.out.println("Please, insert the number!");
            }

        }
    }

    public static void showMenu(){
        System.out.println("What you want to do?");
        System.out.println("1. Build small tower");
        System.out.println("2. Build medium tower");
        System.out.println("3. Build big tower");
        System.out.println("4. Get number of your towers");
        System.out.println("5. Fight!");
        System.out.println("6. Quit game");
    }
    public static void buildTower (User user, int option){
        switch(option){
            case 1:
                if(user.buyTower(priceOfSmallTower)) {
                    user.getTowersList().add(abstractFactory.getTower(user, smallTower));
                }
                break;
            case 2:
                if(user.buyTower(priceOfMediumTower)) {
                    user.getTowersList().add(abstractFactory.getTower(user, mediumTower));
                }
                break;
            case 3:
                if(user.buyTower(getPriceOfBigTower)){
                    user.getTowersList().add(abstractFactory.getTower(user,bigTower));
                }
                break;
            case 4: user.getNumberOfTowers();break;
            case 5: user.fight(); break;
        }
    }
}
