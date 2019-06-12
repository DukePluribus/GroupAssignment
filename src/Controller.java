public class Controller {
    private String username;

    private Model model;

    private View user;



    //Constructor

    //When a user "opens" the app, it will create a controller that will attach itself to the Model

    public Controller(Model _model){

        model = _model;

        user = new View(this);

    }



    public void loginRequest(String _username, String password){

        if(model.verifyCredentials(_username, password)){

            username = _username;

            model.attachUser(this);                         //The controller attaches itself to the user list in the model so that it can be notified of changes

            user.switchWindow("landingPage");   //Tell the view to switch windows

        }

        else{

            user.errorWindow("The username or password is incorrect. /n If you do not remember your password, use the Password Recovery option.");

        }

    }



    public void registerRequest(String username, String email, String password){

        if(model.registerUser(username,email,password)){

            loginRequest(username,password);

        }

        else{

            /*Todo

            Throw some exception or handle the case that the username or account already exists.

            Output something to the view to indicate that there is an error.

             */

        }

    }



    public void accountRecovery(String email){

        try {

            model.recoverPassword(email, username);

            /*Todo

            If this doesnt fail, we will need to have a window pop up that has

            the users password displayed

             */

        }

        catch (Exception e){

            /*Todo

            Call the view to display an error message

             */

        }

    }

    //This method will be called when the window is closed and the user exits the program

    public void userExit(){

        model.detachUser(this);

    }



    public void receiveMessage(String message){

        user.updateMessagePane(message);

    }



    //Takes the message from the view and sends it to the model to be sent to the

    //other users

    public void sendMessage(String message){

        model.sendMessage(message);

    }



}

