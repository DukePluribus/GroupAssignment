//this is the model class that communicates between the controller and the database
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Model {

    private ArrayList<Controller> userList;

    public Model() {
        userList = new ArrayList<Controller>();
    }

    public void sendMessage(String message) {
        for (Controller user : userList) {
            user.receiveMessage(message);
        }
    }

    public void attachUser(Controller user) {
        userList.add(user);
    }

    public void detachUser(Controller user) {
        userList.remove(user);
    }

    //verify if the user's username and password combo exist in the database
    public boolean verifyCredentials(String _username, String _password) {
        return UserDatabase.getInstance().verifyCreds(_username,_password);
    }
    //register User, if username or email is in the system, the user will not be able to register to database
    public boolean registerUser(String username, String email, String password) {
        if((UserDatabase.getInstance().verifyCreds(username,password))||(UserDatabase.getInstance().verifyEmail(email))){
            return false;
        }
        try{
            UserDatabase.getInstance().addUsertobase(UserDatabase.getInstance().createUser(username,email,password,false));
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    //recover password from user's email
    public String recoverPassword(String email) throws Exception{
        try{
            return UserDatabase.getInstance().getPassword(email);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        throw new Exception("Error Message: No email and Password found");
    }
    //delete the User object in the database with the matching username and password
    public boolean deleteAccount(String username, String password) throws Exception{
        try{
            return UserDatabase.getInstance().removeUser(username,password);
        }catch(Exception e){
            return false;}
    }
    //change the user's password
    public boolean changePassword(String username, String newPassword) throws Exception{
        try{
            return UserDatabase.getInstance().changePassword(username,newPassword);
        }catch(Exception e){
            return false;
        }
    }
    //save the database JSON file
    public void save() throws IOException{
        UserDatabase.getInstance().save();
    }
}
