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
    public void addUsertobase(User user){
        if(verifyCreds(user.username,user.password)!=true){
            usersList.add(user);}
    }
    public boolean verifyCreds(String username, String password){
        for(int i=0; i<usersList.size();i++){
            String userlist=usersList.get(i).getUsername();
            String passwordlist =usersList.get(i).getPassword();
            if((userlist.equals(username)&&(passwordlist.equals(password)))){
                return true;
            }
        }
        return false;
    }
    public String getPassword(String email) throws Exception {
        for(int i=0; i<usersList.size();i++){
            if(usersList.get(i).getEmail().equals(email)){
                return usersList.get(i).getPassword();
            }
        }
        throw new Exception("Error Message: No email and password found");
    }
    public User createUser(String username, String email, String password, boolean isTutor){
        User user=new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);
        user.setTutor(false);
        return user;
    }
    public void save() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new FileOutputStream(("usersDB")), this);
    }
    //we need a single object mapper that will create the file and pass it back
    public static UserDatabase getInstance(){
        if(singleInstance==null){
            ObjectMapper mapper =new ObjectMapper();
            try {
                singleInstance = mapper.readValue(new FileInputStream("usersDB"), UserDatabase.class);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return singleInstance;
    }

}



