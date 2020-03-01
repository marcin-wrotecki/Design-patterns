package system;

import java.util.Random;
import java.util.Scanner;

public class Login {

    public int showMenu() {
        System.out.println("What you want to do?");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sign in");
        System.out.println("2. Sign up");
        System.out.println("3. Switch off system");
        int number = sc.nextInt();
        if(number==1 || number==2||number==3) {
            return number;
        }
        else
            System.out.println("Wrong option");
        return -1;
    }

    public int operation(){
        System.out.println("Choose operation:");
        System.out.println("1. Send message");
        System.out.println("2. Try to add new friend");
        System.out.println("3. Get number of your friends");
        System.out.println("4. Sign out");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public boolean addFriend(){
        Random rand = new Random();
        if(rand.nextInt()%2==1) {
            System.out.println("Friend was added!");
            return true;
        }
        else {
            System.out.println("Can't add new friend");
            return false;
        }

    }

    public void sendMessage(){
        System.out.println("Message was sent");
    }



}
