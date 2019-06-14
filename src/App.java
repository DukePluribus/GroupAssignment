import java.io.IOException;

public class App {

    public static void main(String args[]){
        Model model = new Model();
        try {

            model.registerUser("mary", "marysmith@gmail.com", "blue");
            model.deleteAccount("johnsmith@gmail.com","yellow");
            model.changePassword("mary", "pink");
            model.save();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //      Controller user1 = new Controller(model);

        //    Controller user2 = new Controller(model);

        System.out.println("The username or password is incorrect. /n If you do not remember your password, use the Password Recovery option.");

    }

}

