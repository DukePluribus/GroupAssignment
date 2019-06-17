public class Controller {
    // Controller Class by conflict
    private String username;

    private Model model;

    private GUIprogram user;

    public Controller(Model _model) {
        model = _model;
        user = new GUIprogram(Controller.this);
    }

    public void loginRequest(String _username, String password) {
        if(model.verifyCredentials(_username, password)) {
            model.attachUser(this);
            username = _username;
            user.loginSuccessful();
        } else {
            user.loginFailed();
        }
    }

    public void registerRequest(String username, String email, String password) {
        try {
            model.registerUser(username, email, password);
            loginRequest(username, password);
        } catch (Exception e) {
        }
    }

    public String accountRecovery(String email) throws Exception {
        String password = model.recoverPassword(email);
        return password;
    }

    public void userExit() {
        model.detachUser(this);
    }
    
    public void deleteAccount(String username, String password){
        try{
            if(model.deleteAccount(username, password)){
                user.deleteAccountSuccesful();
            } else {
                user.deleteAccountFail();
            }
        } catch(Exception e){
        }
    }

    public void receiveMessage(String message) {
        user.receiveMessage(message);
    }

    public void sendMessage(String message) {
        model.sendMessage(username + ": " + message);
    }
}
