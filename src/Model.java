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

    public boolean verifyCredentials(String _username, String _password) {

        return UserDatabase.getInstance().verifyCreds(_username,_password);
    }

    public boolean registerUser(String username, String email, String password) {
        if(UserDatabase.getInstance().verifyCreds(username,password)){
            return false;
        }
        UserDatabase.getInstance().addUsertobase(UserDatabase.getInstance().createUser(username,email,password,false));
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
    public void deleteAccount(String username, String password) throws Exception{
        try{
            UserDatabase.getInstance().removeUser(username,password);
        }catch(Exception e){}
    }
    public void changePassword(String username, String newPassword) throws Exception{
        try{
            UserDatabase.getInstance().changePassword(username,newPassword);
        }catch(Exception e){

        }
    }
    public void save() throws IOException{
        UserDatabase.getInstance().save();
    }
}
