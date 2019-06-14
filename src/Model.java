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
        return true;
    }

    public boolean registerUser(String username, String email, String password) {
        return true;
    }

    public String recoverPassword(String email) {
        return "password";
    }
}
