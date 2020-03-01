package system;

import java.util.ArrayList;
import java.util.HashMap;

public class LoginSystem {

    private static HashMap<String,String> users;
    private static HashMap<String, Integer> usersFriends;

    public LoginSystem(){
        users=new HashMap<>();
        usersFriends=new HashMap<>();
    }

    public void addFriend(String userName){
        usersFriends.put(userName,usersFriends.get(userName)+1);
    }

    public boolean checkCorrectness(String userName, String password){
        if(users.containsKey(userName)){
            if(password.equals(users.get(userName))) {
                return true;
            }
            else
                System.out.println("Wrong password");
        }
        else
            System.out.println("User does not exist");
        return false;
    }

    public boolean createUser(String userName, String password){
        if(users.containsKey(userName))
            System.out.println("User exists");
        else{
            if(password.length()>=8) {
                users.put(userName, password);
                usersFriends.put(userName,0);
                return true;
            }
            else
                System.out.println("Password should contain at least 8 characters");
        }
        return false;
    }

    public int getNumberOfFriends(String userName){
        return usersFriends.get(userName);
    }



}
