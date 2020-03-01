package system;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LoginFacade {

    private Login login;
    private LoginSystem loginSystem;

    public LoginFacade(){
        login = new Login();
        loginSystem =new LoginSystem();
    }

    public void showMenu() {
        int option = login.showMenu();
        if (option == 1 || option == 2) {
            Scanner sc = new Scanner(System.in);
            String userName, password;
            System.out.println("User name: ");
            userName = sc.nextLine();
            System.out.println("Password: ");
            password = sc.nextLine();
            authorization(userName,password,option);
        }
        else if(option==3) {
            System.out.println("Have a nice day! Bye!");
            return;
        }
        else{
            showMenu();
        }
    }

    public void authorization(String userName, String password,int option) {
        switch (option) {
            case 1:
                System.out.println("Authorization...");
                if (identification(userName, password)) {
                    System.out.println("Login successful");
                    while (true) {
                        switch (login.operation()) {
                            case 1:
                                login.sendMessage();
                                break;
                            case 2:
                                if (login.addFriend()) {
                                    loginSystem.addFriend(userName);
                                }
                                break;
                            case 3:
                                System.out.format("You have %d friends!\n",getNumberOfFriends(userName));
                                break;
                            case 4:
                                showMenu();return;
                            default:
                                System.out.println("Wrong option");
                        }

                    }
                }
                else{
                        System.out.println("Login Failed");
                        showMenu();
                }
                break;
            case 2:
                if (createUser(userName, password))
                    System.out.println("User was created");

                showMenu();
                break;
            default:
                System.out.println("Wrong option");
                showMenu();

        }
    }

    public int getNumberOfFriends(String userName){
        return loginSystem.getNumberOfFriends(userName);
    }
    public boolean identification(String login, String password){
        return loginSystem.checkCorrectness(login,password);
    }

    public boolean createUser(String login, String password){
        return loginSystem.createUser(login,password);
    }
}
