import java.util.ArrayList;
import java.util.List;

public class Model {
    private ArrayList<Controller> userList;

    public Model(){
        userList = new ArrayList<Controller>();
    }
    
    public void sendMessage(String message){
        for (Controller user:userList
             ) {
            user.receiveMessage(message);
        }

        /*
        TODO
        Add code that will cycle through the list of Controller objects
        in the userList, calling each of their receiveMessage methods
         */
    }

    public void attachUser(Controller user){
        userList.add(user);
    }

    public void detachUser(Controller user){
        userList.remove(user);
    }

    public boolean verifyCredentials(String _username, String _password){
        /*Todo
        Check to see if the username-password combination exists in the database. If yes
        return true. Otherwise, return false to the controller.
         */
        return true;
    }

    public boolean registerUser(String username, String email, String password) {
        /*Todo
        Verify that this account/username does not exist yet in the DB. If it does,
        return false. If it is not there yet, add new user entry, and return true.
         */
        return true;
    }

    public String recoverPassword(String email) {
        /*Todo
        Check the database, see if the email exists in it. If it does, return the password.
        Otherwise, throw an AccountNotFound exception.
         */
        return "password";
    }


}
