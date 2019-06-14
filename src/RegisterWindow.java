public class RegisterWindow {

    GUIprogram mainProgram;

    public String getRegisteredEmail() {
        if ((!mainProgram.getEmailRegistered().equals("")) && (mainProgram.getEmailRegistered().contains("@"))) {
            String regEmailAdd = mainProgram.getEmailRegistered();
            return regEmailAdd;
        } else {
            return ("User has not inputted an email address");
        }
    }

    public String getRegisteredUsername() {
        if (!mainProgram.getUserNameRegistered().equals("")) {
            String regUN = mainProgram.getUserNameRegistered();
            return regUN;
        } else {
            return ("User has not inputted a username");
        }
    }

    public String getPasswordRegistered() {
        String pwd = "";
        if (mainProgram.getPasswordRegistered().equals(mainProgram.getPasswordVerifyRegistered())) {
            pwd = mainProgram.getPasswordRegistered();
            return pwd;
        } else {
            return ("Password has not been verified");
        }
    }

   
}
