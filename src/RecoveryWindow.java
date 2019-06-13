/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jsaunders
 */
public class RecoveryWindow {
    
    GUIprogram mainProgram;
    
    
    
    /*
    returns the email address provided in the recovery window
    */
    public String getEmailAddress() {
        if ((!mainProgram.getRecoveryEmail().equals(""))&&(mainProgram.getRecoveryEmail().contains("@"))){
            String emA = mainProgram.getRecoveryEmail();
            return emA;    
        }
        else{
            return "User has not entered a valid email address";
        }
    }
    /*
     Registers if the submitButton for the recovery screen has been pressed. 
     The control class will check the boolean value and if true, the controll class will
     run the method: accountRecovery(this.getEmailAddress());
     */
    public boolean submitButtonPressed() {
       if(mainProgram.registerPressed(true)){
          return true;
       }
       return false;
       
    }
    
    
    
    
}
