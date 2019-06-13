/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author jsaunders
 */
public class Credentials {
    
    /*
    This class is used for obtaining the password information from the GUI;
    */
    
    
    
    
    /*
    Takes a password and returns a password: 
    This method is private to prevent the password from changing if accessed from a memory leak
    */
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
    
    /*
    takes a password array
    and
    returns the password as a string using the private parsePassword method    
    */
    public String getPassword(char[] password){
        String pwd = parsePassword(password);
        return pwd;        
    }
    
}
