import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Model {

    private ArrayList<Controller> userList;

    public Model() {
        userList = new ArrayList<Controller>();
    }

    public void sendMessage(String message) {
        for (Controller user : userList) {
            user.receiveMessage(message);
        }

    public void attachUser(Controller user){}
       userList.add(user);
   }



   public void detachUser(Controller user){}
       userList.remove(user);
   }



    public boolean verifyCredentials(String _username, String _password) {
        return UserDatabase.getInstance().verifyCreds(_username,_password);
    }

    public boolean registerUser(String username, String email, String password) {
        if(UserDatabase.getInstance().verifyCreds(username,password)){
            return false;
        }
        try{
            UserDatabase.getInstance().addUsertobase(UserDatabase.getInstance().createUser(username,email,password,false));
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    public String recoverPassword(String email) throws Exception{
        try{
            return UserDatabase.getInstance().getPassword(email);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        throw new Exception("Error Message: No email and Password found");
    }
    public boolean deleteAccount(String username, String password) throws Exception{
        try{
            return UserDatabase.getInstance().removeUser(username,password);
        }catch(Exception e){
            return false;}
    }
    public boolean changePassword(String username, String newPassword) throws Exception{
        try{
            return UserDatabase.getInstance().changePassword(username,newPassword);
        }catch(Exception e){
            return false;
        }
    }
    public void save() throws IOException{
        UserDatabase.getInstance().save();
    }

 }
