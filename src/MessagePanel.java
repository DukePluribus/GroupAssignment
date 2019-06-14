public class MessagePanel {

    GUIprogram mainProgram;

    public String getIPAddress() {
        String ip = mainProgram.getIP();
        return ip;
    }

    public int getPortNumber() {
        String userInputPortNumber = mainProgram.getPort();
        int portNumber = -1;
        try {
            portNumber = Integer.parseInt(userInputPortNumber);
        } catch (NumberFormatException e) {
        }
        if (portNumber == -1) {
            return -1;
        } else {
            return portNumber;
        }
    }

    public String returnError() {
        if (getPortNumber() == -1) {
            return "User did not enter a correct port number";
        } else {
            return "User entered a port number";
        }
    }


    public String updateMessageWindow() {
        if (!mainProgram.getSentMessage().equals("")) {
            String message = mainProgram.getSentMessage();
            return message;
        } else {
            return "Blank Message, Nothing returned";
        }
    }

    public boolean checkIfMessageSent(boolean messages) {
        if (mainProgram.messageSent(true)) {
            return true;
        }
        return false;
    }

    public boolean checkForConnection() {
        if (mainProgram.connectionButtonPressed(true)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getStatus() {
        while (checkForConnection() == true) {
        }
        return true;
    }
}
