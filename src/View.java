
public class View {

    /*NOTE
    It may be better for all the windows to be their own classes, and have the View class just hold these internal classes?
    Actually, I think that might be the best way to go about it... Object oriented and all.
     */
    Controller controller;

    public View(Controller _controller){
        controller = _controller;
    }

    public void updateMessagePane(String message){

        /*Todo

        This is the method that will be called by the controller when a new message is sent out and needs to be

        displayed in the messages window

         */

    }



    public void switchWindow(String windowName){

        /*Todo

        Controller will call this method to switch the view from one window

        to another.

         */

    }



    public void errorWindow(String message){

        /*Todo

        This will be a generic error message window that will pop up when something

        goes wrong. It will display whatever message is passed to it.

         */

    }



    private void loginWindow(){

        /*Todo

        This will be the window that opens up when a user first starts the application.



        From here, a user can either use a button to go to the registerWindow, or can

        click a button to navigate to the recoverPasswordWindow.



        If a user enters login information and clicks the logIn button, call controller.loginRequest()

        If the login is successful, Controller will just call the switchWindow command here, so it doesn't

        have to worry about what happens.

         */

    }



    private void registerWindow(){

        /*Todo

        Have this method open up the registration window, where a user can input

        their email, username, and password. Then, when they click the button to register

        and have data in all the views, the view will call the registerRequest() method of

        the controller.



        This does not have to worry about what happens with the registration request, the Controller will handle that



        This window will also need a back button, which will call switchWindow(loginWindow)

         */

    }

    private void loginWindow(){
        /*Todo
        This will be the window that opens up when a user first starts the application.

        From here, a user can either use a button to go to the registerWindow, or can
        click a button to navigate to the recoverPasswordWindow.

        If a user enters login information and clicks the logIn button, call controller.loginRequest()
        If the login is successful, Controller will just call the switchWindow command here, so it doesn't
        have to worry about what happens.
         */
    }

    private void registerWindow(){
        /*Todo
        Have this method open up the registration window, where a user can input
        their email, username, and password. Then, when they click the button to register
        and have data in all the views, the view will call the registerRequest() method of
        the controller.

        This does not have to worry about what happens with the registration request, the Controller will handle that

        This window will also need a back button, which will call switchWindow(loginWindow)
         */
    }

    private void landingWindow(){
        /*Todo
        Honestly, this is basically a placeholder for extensability. For now, there will just be a button "chat room"
        that switches the window to the chatWindow. The idea is that, in the future, we can add more rooms or 1-to-1
        functionality. If you want, can put those in here as "under construction" with no functionality
         */
    }

    private void chatWindow(){
        /*Todo
        This will be just a window that displays text, and a text box underneath that user can put a message into. When
        the send message button is pressed, just call the sendMessage() function of the controller, passing the text that
        is in the text box.

        The updateMessagePane() function in this class will need to update the part of this window that displays the chat.
        This could probably be moved into this method though? Not sure what you think would be the best way to approach this.

        It will also be important that the text scrolls when it gets too long.
         */
    }

    private void recoverAccountWindow(){
        /*
        This will just have a text box and a button that sends the email in the textbox to accountRecovery from Controller.
        Controller will handle any logic that stems from this
        Also, a back button that leads to the loginWindow.
         */
    }



    /*Todo

    Will need a window for each view

    -Login window

    -Landing page

    -Chatroom

    -Registration

    -Account Recovery



     */



    /*Todo

    Very important, on exit, we need to detach the user from the model

    Call controller.userExit()

     */

}