

/**
 *
 * @author jsaunders
 */
public class RegisterWindow {
    
    GUIprogram mainProgram;
    Credentials password;
    
    /*
    obtains the email address the user enters
    */
    public String getRegisteredEmail(){
        if ((!mainProgram.getEmailRegistered().equals(""))&&(mainProgram.getEmailRegistered().contains("@"))){
            String regEmailAdd = mainProgram.getEmailRegistered();
            return regEmailAdd;
        }
        else{
            return ("User has not inputted an email address");
        }
    }
    
    /*
    obtains the username the user enters
    */
    public String getRegisteredUsername(){
        if (!mainProgram.getUserNameRegistered().equals("")){
            String regUN = mainProgram.getUserNameRegistered();
            return regUN;
        }
        else{
            return ("User has not inputted a username");
        }
    
    }
    
    /*
    Checks if Password fields match.
    If so, obtains the password
    otherwise, returns message indicating the passwords are not the same;
    */
    public String getPasswordRegistered(){
        String pwd = "";
        if(mainProgram.getPasswordRegistered().equals(mainProgram.getPasswordVerifyRegistered())){
            pwd = mainProgram.getPasswordRegistered();
            return pwd;
        }
        
        else{
                return ("Password has not been verified");
        }
                
    }
    
}
