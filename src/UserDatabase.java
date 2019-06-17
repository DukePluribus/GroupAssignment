//this is the userdatabase class that creates a new instance of the JSON file and updates the database.
//this class communicates between the JSON file and the model
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class UserDatabase {
    public ArrayList<User> usersList;
    private static UserDatabase singleInstance = null;

    private UserDatabase() throws IOException {
    }
    //add object User to the database
    public void addUsertobase(User user) throws IOException {
        if(verifyCreds(user.getUsername(),user.getPassword())!=true){
            usersList.add(user);}
        UserDatabase.getInstance().save();
    }
    //verify if a user with the username and password combo are in the system
    public boolean verifyCreds(String username, String password) {
        for (User user : usersList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    //verify of the database has a user with an email address already in the system
    public boolean verifyEmail(String email){
        for (User user : usersList) {
            if (user.getUsername().equals(email)){
                return true;
            }
        }
        return false;
    }
    //recover the user's password from the user's email address
    public String getPassword(String email) throws Exception {
        for(int i=0; i<usersList.size();i++){
            if(usersList.get(i).getEmail().equals(email)){
                return usersList.get(i).getPassword();
            }
        }
        throw new Exception("Error Message: No email and password found");
    }
    //create a new User object
    public User createUser(String username, String email, String password, boolean isTutor){
        User user=new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);
        user.setTutor(isTutor);
        return user;
    }
    //save the database JSON file
    public void save() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new FileOutputStream(("usersDB")), this);
    }
    //we need a single object mapper that will create the file and pass it back
    public static UserDatabase getInstance(){
        if(singleInstance==null){
            ObjectMapper mapper = new ObjectMapper();
            try {
                singleInstance = mapper.readValue(new FileInputStream("usersDB"), UserDatabase.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return singleInstance;
    }
    //deleting a user from the database
    public boolean removeUser(String username, String password) throws IOException {
        for(int i=0; i<usersList.size();i++) {
            String userlist = usersList.get(i).getUsername();
            String passwordlist = usersList.get(i).getPassword();
            if ((userlist.equals(username) && (passwordlist.equals(password)))) {
                usersList.remove(i);
                UserDatabase.getInstance().save();
                return true;
            }
        }
        return false;
    }
    //changing the user's password
    public boolean changePassword(String username, String password) throws IOException {
        for(int i=0;i<usersList.size();i++){
            if(usersList.get(i).getUsername().equals(username)){
                usersList.get(i).setPassword(password);
                UserDatabase.getInstance().save();
                return true;
            }
        }
        return false;
    }
}



