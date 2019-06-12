import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class Model {

    private List<Controller> userList;
    private HashMap<String, User> userHashMap;
    private int count;
    //FileReader file = new FileReader("C:\\Users\\madel\\IdeaProjects\\CS410GroupProject\\src\\usersDB");

    public Model(){
        userHashMap=new HashMap<String, User>();
        count=0;
    }



    public void sendMessage(String message){

        for (Controller user:userList) {

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



    public boolean verifyCredentials(String _username, String _password) {
        if (userHashMap.containsKey(_username)) {
            User temp = userHashMap.get(_username);
            String tempPass = temp.password;
            if (tempPass.equals(_password)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

        /*try {
            FileReader file = new FileReader("C:\\Users\\madel\\IdeaProjects\\CS410GroupProject\\src\\usersDB");
            Object obj = new JSONParser().parse(file);
            JSONObject jsonObject=(JSONObject) obj;
            if((jsonObject.containsValue(_username))&&jsonObject.containsValue(_password)){
                if((jsonObject.get(_username)).equals(jsonObject.get(_password))) {
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found");
            return false;
        }
        catch( java.io.IOException e){
            return false;
        }
        catch(ParseException e) {
            return false;*/
        /*Todo

        Check to see if the username-password combination exists in the database. If yes

        return true. Otherwise, return false to the controller.

         */





//hello


    public boolean registerUser(String username, String email, String password) {
        if (verifyCredentials(username, password)){
            return false;
        }
        else {
            count++;
            User temp = new User(username, email, password);
            userHashMap.put(username, temp);
            return true;
        }

    }
       /*if(verifyCredentials(username, password)==true) {
          return false;
        }
       else {
            try {
                JSONObject jsonObj = new JSONObject();
                jsonObj.put("email", email);
                jsonObj.put("username", username);
                jsonObj.put("password", password);
                jsonObj.put("isTutor", false);
                FileWriter file = new FileWriter("C:\\Users\\madel\\IdeaProjects\\CS410GroupProject\\src\\usersDB");
                file.write(jsonObj.toJSONString());
                file.close();
                System.out.println("Thank you "+username+" you are now registered for ChatterBox!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }*/


        /*Todo

        Verify that this account/username does not exist yet in the DB. If it does,

        return false. If it is not there yet, add new user entry, and return true.

         */





    public String recoverPassword(String username, String email){
        if(userHashMap.containsKey(username)==true) {
            User temp = userHashMap.get(username);
            if (temp.email.equals(email)) {
                return temp.password;
            }
            else return "That we do not have that email and username combination. Please try again.";
        }
        else return "This username does not exist in our system. Please try again";

        /*try {
            FileReader file = new FileReader("C:\\Users\\madel\\IdeaProjects\\CS410GroupProject\\src\\usersDB");
            Object obj = new JSONParser().parse(file);
            JSONObject jsonObject = (JSONObject) obj;
            if (jsonObject.containsValue(email) == true) {
                jsonObject.get(email);
                String password = jsonObject.get("password").toString();
                return password;
            } else {
                return "This email address does not exist in our system. Please try again.";
            }
        }
        catch (Exception e){
            return "File not found";
        }*/

    }
    public void deleteAccount(String username){
        userHashMap.remove(username);
        count--;
    }
    public void test(String username, String password, String email){
        boolean verify= verifyCredentials(username, password);
        System.out.println(verify);
        String _password=recoverPassword(email, username);
        System.out.println(_password);
        System.out.println(userHashMap.keySet().toString());

    }

    public static void main(String args[]){
        Model m=new Model();
        m.registerUser("jsmith", "johnsmith@gmail.com", "rain");
        m.registerUser("mhall", "maddiehall@gmail.com", "seattle");
        m.test("jsmith", "rain", "johnsmith@gmail.com");
    }
}


