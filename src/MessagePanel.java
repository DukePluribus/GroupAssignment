
/**
 *
 * @author jsaunders
 */


public class MessagePanel {
    
    /*
    This class is for the 1 to 1 chat session.
    It checks if messages are sent and if so, 
    it allows the controller access to receive the message.
    */
    
    GUIprogram mainProgram;
    
    /*
    obtains IP address user entered
    */
    
    public String getIPAddress(){
       String ip = mainProgram.getIP();
       return ip;
    }
   
    
    /*
    Obtains port number user entered
    */
    
    public int getPortNumber() {
        String userInputPortNumber = mainProgram.getPort();
        int portNumber = -1;
        try {
          portNumber = Integer.parseInt(userInputPortNumber);
        } catch(NumberFormatException e)  {
           
        }
        if (portNumber==-1){
            return -1;
        }
        else{
            return portNumber;
        }
    }
    
    /*
    Returns a customized error message if the
    user does not enter an integer in the port field
    */
        
    public String returnError(){
  
        if(getPortNumber()==-1){
            return "User did not enter a correct port number";
        }
        // this return statement below is not used since this method is not called when the port number is not -1
        else{
            return "User entered a port number";
        }
    }
    
    
    /*
    
    Creates a connection using the Connection class
    that uses a String for the IP address
    and an int for the port number
    
    */
    public Connection getConnectionInfo(){
        String ip = getIPAddress();
        int port = getPortNumber();
        
        Connection connection = new Connection(ip,port);
        
        if (getPortNumber()==-1){
            returnError();  
            return connection;
        }
        else{
            return connection; 
        }
        
    }
    
    /*
    Allows access to the messageWindow
    and returns the message.
    */
    public String updateMessageWindow(){
        if(!mainProgram.getSentMessage().equals("")){
            String message = mainProgram.getSentMessage();
            return message;
        }
        else{
            return "Blank Message, Nothing returned";
        }
    }
    
    /*
    This method checks if the user has sent a message
    if so it returns true. The controller can then
    use receiveMessage(this.updateMessageWindow())
    */
    public boolean checkIfMessageSent(boolean messages){
        if (mainProgram.messageSent(true)){
           return true;
        }
        return false;
    }
    
    public boolean checkForConnection(){
        if(mainProgram.connectionButtonPressed(true)){
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean getStatus(){
        while(checkForConnection()==true){
//            if(control.getStatus.equals(false)){
//                return false;
//            }
        }
    return true;
 
    }
        
    
    
    
    
}
