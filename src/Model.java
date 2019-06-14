import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Model {

    private ArrayList<Controller> userList;

//    private int count;

//


   public void sendMessage(String message){}
//
  //      for (Controller user:userList) {
//
    //       user.receiveMessage(message);
//
//        }
//
//
//
//        /*
//
//        TODO
//
//        Add code that will cycle through the list of Controller objects
//
//        in the userList, calling each of their receiveMessage methods
//
//         */
//
//    }
//
//
public void attachUser(Controller user){}
//
//        userList.add(user);
//
//    }
//
//
//
   public void detachUser(Controller user){}
//
//        userList.remove(user);
//
//    }
//
//
//
   public boolean verifyCredentials(String _username, String _password) {
       return UserDatabase.getInstance().verifyCreds(_username,_password);
       }
//
//        /*Todo
//
//        Check to see if the username-password combination exists in the database. If yes
//
//        return true. Otherwise, return false to the controller.
//
//         */
//        }
//
//    }
//
//
//
//
  public boolean registerUser(String username, String email, String password) {
        if(UserDatabase.getInstance().verifyCreds(username,password)){
            return false;
        }
       UserDatabase.getInstance().addUsertobase(UserDatabase.getInstance().createUser(username,email,password,false));
       return true;


       }
//
//
//        /*Todo
//
//        Verify that this account/username does not exist yet in the DB. If it does,
//
//        return false. If it is not there yet, add new user entry, and return true.
//
//         */
//
//
//    }
//
//
   public String recoverPassword(String email)throws Exception{
       try {
           return UserDatabase.getInstance().getPassword(email);
       } catch (Exception e) {
           e.printStackTrace();
       }throw new Exception("Error Message: No email and password found");

   }

   public void deleteAccount(String username, String password) throws Exception{
        try{
            UserDatabase.getInstance().removeUser(username,password);
        } catch(Exception e){

        }
   }
   public void changePassword(String username, String newPassword) throws Exception{
       try {
           UserDatabase.getInstance().changePassword(username, newPassword);
       } catch (Exception e) {
       }
   }

    public void save() throws IOException {
        UserDatabase.getInstance().save();
    }

 }