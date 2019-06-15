public class RecoveryWindow {

    GUIprogram mainProgram;

    public String getEmailAddress() {
        if ((!mainProgram.getRecoveryEmail().equals("")) && (mainProgram.getRecoveryEmail().contains("@"))) {
            String emA = mainProgram.getRecoveryEmail();
            return emA;
        } else {
            return "User has not entered a valid email address";
        }
    }

    public boolean submitButtonPressed() {
        if (mainProgram.registerPressed(true)) {
            return true;
        }
        return false;
    }
}
