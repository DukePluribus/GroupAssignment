public class View {

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
