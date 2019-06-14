import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LoginWindow {

    GUIprogram mainProgram;

    public LoginWindow(GUIprogram _program) {
        mainProgram = _program;
    }

    public String getUserName() {
        String uN = mainProgram.getUserName();
        return uN;
    }
    
    private String parsePassword(char[] password){
      String pwdI = Arrays.toString(password);
       String newPSWD = "";
      int x =1;
      int y = x+3;
      
      for (int i = 1; i<pwdI.length(); i+=3) {
          char ch = pwdI.charAt(i);
         String character = Character.toString(ch);
         newPSWD +=character;
      }
      
    return newPSWD;

   }
    
       public String getLoginPassword(char[] password){
        String pwd = parsePassword(password);
        return pwd;        
    }

    public String getPassword() {
        String pwd = getLoginPassword(mainProgram.getPassword());
        return pwd;
    }

    

    
}
