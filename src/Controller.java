

public class Controller {
    private String username;
    private Model model;
    //private View user;
    private GUIprogram user;

    public Controller(Model _model) {
        model = _model;
        user = new GUIprogram(Controller.this);
    }

    public boolean loginRequest(String _username, String password){
        System.out.println("loginRequest in controller called");
        if(model.verifyCredentials(_username, password)){
            model.attachUser(this);                         //The controller attaches itself to the user list in the model so that it can be notified of changes
            username = _username;
            return true;   //Tell the view to switch windows
        }
        return false;
    }

    public void registerRequest(String username, String email, String password){
        try{
            model.registerUser(username,email,password);
            loginRequest(username,password);
        } catch (Exception e){  
        }
    }

    public String accountRecovery(String email){
            return model.recoverPassword(email);
    }
    
    //This method will be called when the window is closed and the user exits the program
    public void userExit(){
        model.detachUser(this);
    }

    public void receiveMessage(String message){
        user.receiveMessage(message);
    }

    //Takes the message from the view and sends it to the model to be sent to the
    //other users
    public void sendMessage(String message){
        model.sendMessage(username+": "+message);
    }

}
