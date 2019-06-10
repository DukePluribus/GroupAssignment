import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class Model {

    private List<Controller> userList;
    //FileReader file = new FileReader("C:\\Users\\madel\\IdeaProjects\\CS410GroupProject\\src\\usersDB");





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



    public static boolean verifyCredentials(String _username, String _password) {
        try {
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
            return false;
        }/*Todo

        Check to see if the username-password combination exists in the database. If yes

        return true. Otherwise, return false to the controller.

         */


    }





    public static boolean registerUser(String username, String email, String password) {
       if(verifyCredentials(username, password)==true) {
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
        }


        /*Todo

        Verify that this account/username does not exist yet in the DB. If it does,

        return false. If it is not there yet, add new user entry, and return true.

         */

   }



    public static String recoverPassword(String email) {
        try {
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
        }

    }
    public static void test(String username, String password, String email){
        boolean verify= verifyCredentials(username, password);
        System.out.println(verify);
        String _password=recoverPassword(email);
        System.out.println(_password);
    }

    public static void main(String args[]){
        registerUser("jsmith", "johnsmith@gmail.com", "rain");
        registerUser("mhall", "maddiehall@gmail.com", "seattle");
        test("jsmith", "rain", "johnsmith@gmail.com");
    }



}
