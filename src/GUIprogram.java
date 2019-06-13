
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author jsaunders
 */
public class GUIprogram extends javax.swing.JFrame {
    private Controller controller;

//Controller control = new Controller();
       

    
    public void displayPrompt()  {
       JOptionPane.showMessageDialog(this, "Incorrect Username or Password", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
   //     jLoginFail.setVisible(true);
    }
        

 
    public GUIprogram(Controller _controller) {
        controller = _controller;
//        java.awt.EventQueue.invokeLater(() -> {
//            GUIprogram guIprogram = new GUIprogram();
//        });

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        
        initComponents();
         jLogin.setVisible(true);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHomeScreen = new javax.swing.JDialog();
        switchFromHomeToOneToOneButton = new javax.swing.JButton();
        switchFromHomeToRoomsButton = new javax.swing.JButton();
        switchFromHomeToAccountSettingsButton = new javax.swing.JButton();
        homeBackButton = new javax.swing.JButton();
        titleHomeScreen = new javax.swing.JLabel();
        backgroundHomeScreen = new javax.swing.JLabel();
        jOnetoOne = new javax.swing.JDialog();
        chatSendMessageBox = new javax.swing.JTextField();
        chatSendButton = new javax.swing.JButton();
        chatBackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ipAdd = new javax.swing.JLabel();
        ipaddTF = new javax.swing.JTextField();
        portTF = new javax.swing.JTextField();
        port = new javax.swing.JLabel();
        oneToOneConnectButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextWindow = new javax.swing.JTextArea();
        background1to1 = new javax.swing.JLabel();
        jLogin = new javax.swing.JDialog();
        username = new javax.swing.JLabel();
        loginUsernameField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        loginPasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        titleLogin = new javax.swing.JLabel();
        switchFromLoginToAcctRecoveryButton = new javax.swing.JButton();
        switchLoginToRegisterButton = new javax.swing.JButton();
        backgroundLogin = new javax.swing.JLabel();
        jRegistration = new javax.swing.JDialog();
        titleReg = new javax.swing.JLabel();
        emailReg = new javax.swing.JLabel();
        regEmailField = new javax.swing.JTextField();
        usernameReg = new javax.swing.JLabel();
        regUsernameField = new javax.swing.JTextField();
        passwordReg = new javax.swing.JLabel();
        regPasswordField = new javax.swing.JPasswordField();
        verfiyPassword = new javax.swing.JLabel();
        regVerifyPasswordField = new javax.swing.JPasswordField();
        regRegisterButton = new javax.swing.JButton();
        regBackButton = new javax.swing.JButton();
        backgroundRegistration = new javax.swing.JLabel();
        jLoginFail = new javax.swing.JDialog();
        jRecovery = new javax.swing.JDialog();
        titleRecover = new javax.swing.JLabel();
        emRec = new javax.swing.JLabel();
        recoveryEmailField = new javax.swing.JTextField();
        recoverySubmitButton = new javax.swing.JButton();
        recoveryBackButton = new javax.swing.JButton();
        backgroundRec = new javax.swing.JLabel();
        jAccountSettings = new javax.swing.JDialog();
        accountChangePasswordButton = new javax.swing.JButton();
        accountContactSuppButton = new javax.swing.JButton();
        accountDeleteAccountButton = new javax.swing.JButton();
        accountBackButton = new javax.swing.JButton();
        titleAS = new javax.swing.JLabel();
        backgroundAS = new javax.swing.JLabel();

        jHomeScreen.setMinimumSize(new java.awt.Dimension(390, 700));
        jHomeScreen.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        switchFromHomeToOneToOneButton.setBackground(new java.awt.Color(163, 163, 181));
        switchFromHomeToOneToOneButton.setForeground(new java.awt.Color(55, 55, 71));
        switchFromHomeToOneToOneButton.setText("1 TO 1");
        switchFromHomeToOneToOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchFromHomeToOneToOneButtonActionPerformed(evt);
            }
        });
        jHomeScreen.getContentPane().add(switchFromHomeToOneToOneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 230, 70));

        switchFromHomeToRoomsButton.setBackground(new java.awt.Color(163, 163, 181));
        switchFromHomeToRoomsButton.setForeground(new java.awt.Color(55, 55, 71));
        switchFromHomeToRoomsButton.setText("ROOMS");
        switchFromHomeToRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchFromHomeToRoomsButtonActionPerformed(evt);
            }
        });
        jHomeScreen.getContentPane().add(switchFromHomeToRoomsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 230, 70));

        switchFromHomeToAccountSettingsButton.setBackground(new java.awt.Color(163, 163, 181));
        switchFromHomeToAccountSettingsButton.setForeground(new java.awt.Color(55, 55, 71));
        switchFromHomeToAccountSettingsButton.setText("ACCOUNT SETTINGS");
        switchFromHomeToAccountSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchFromHomeToAccountSettingsButtonActionPerformed(evt);
            }
        });
        jHomeScreen.getContentPane().add(switchFromHomeToAccountSettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 230, 70));

        homeBackButton.setBackground(new java.awt.Color(163, 163, 181));
        homeBackButton.setForeground(new java.awt.Color(55, 55, 71));
        homeBackButton.setText("LOG OUT");
        homeBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBackButtonActionPerformed(evt);
            }
        });
        jHomeScreen.getContentPane().add(homeBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, 40));

        titleHomeScreen.setBackground(new java.awt.Color(55, 55, 71));
        titleHomeScreen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleHomeScreen.setForeground(java.awt.Color.lightGray);
        titleHomeScreen.setText("WELCOME");
        jHomeScreen.getContentPane().add(titleHomeScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        backgroundHomeScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        backgroundHomeScreen.setMaximumSize(new java.awt.Dimension(450, 725));
        backgroundHomeScreen.setMinimumSize(new java.awt.Dimension(400, 700));
        backgroundHomeScreen.setPreferredSize(new java.awt.Dimension(400, 720));
        jHomeScreen.getContentPane().add(backgroundHomeScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 377, 666));

        jOnetoOne.setMinimumSize(new java.awt.Dimension(385, 700));
        jOnetoOne.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatSendMessageBox.setBackground(new java.awt.Color(163, 163, 181));
        chatSendMessageBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        chatSendMessageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatSendMessageBoxActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(chatSendMessageBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 260, 30));

        chatSendButton.setBackground(new java.awt.Color(163, 163, 181));
        chatSendButton.setForeground(new java.awt.Color(55, 55, 71));
        chatSendButton.setText("ENTER");
        chatSendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatSendButtonActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(chatSendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, -1, 30));

        chatBackButton.setBackground(new java.awt.Color(163, 163, 181));
        chatBackButton.setForeground(new java.awt.Color(55, 55, 71));
        chatBackButton.setText("BACK");
        chatBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatBackButtonActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(chatBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 340, -1));

        jLabel1.setBackground(new java.awt.Color(55, 55, 71));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setText("CHAT 1 ON 1");
        jOnetoOne.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        ipAdd.setForeground(new java.awt.Color(229, 124, 0));
        ipAdd.setText("IP Address:");
        jOnetoOne.getContentPane().add(ipAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        ipaddTF.setBackground(new java.awt.Color(163, 163, 181));
        ipaddTF.setForeground(new java.awt.Color(55, 55, 71));
        ipaddTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        jOnetoOne.getContentPane().add(ipaddTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 30));

        portTF.setBackground(new java.awt.Color(163, 163, 181));
        portTF.setForeground(new java.awt.Color(55, 55, 71));
        portTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        portTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portTFActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(portTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 60, 30));

        port.setForeground(new java.awt.Color(229, 124, 0));
        port.setText("Port:");
        jOnetoOne.getContentPane().add(port, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        oneToOneConnectButton.setBackground(new java.awt.Color(163, 163, 181));
        oneToOneConnectButton.setForeground(new java.awt.Color(55, 55, 71));
        oneToOneConnectButton.setText("CONNECT");
        oneToOneConnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneToOneConnectButtonActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(oneToOneConnectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0), 3));

        messageTextWindow.setBackground(new java.awt.Color(163, 163, 181));
        messageTextWindow.setColumns(20);
        messageTextWindow.setRows(5);
        messageTextWindow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(messageTextWindow);

        jOnetoOne.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 330));

        background1to1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jOnetoOne.getContentPane().add(background1to1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLogin.setMinimumSize(new java.awt.Dimension(400, 720));
        jLogin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setForeground(new java.awt.Color(229, 124, 0));
        username.setText("Username: ");
        jLogin.getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        loginUsernameField.setBackground(new java.awt.Color(163, 163, 181));
        loginUsernameField.setForeground(new java.awt.Color(55, 55, 71));
        loginUsernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        loginUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameFieldActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(loginUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 320, 40));

        password.setForeground(new java.awt.Color(229, 124, 0));
        password.setText("Password:");
        jLogin.getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        loginPasswordField.setBackground(new java.awt.Color(163, 163, 181));
        loginPasswordField.setForeground(new java.awt.Color(55, 55, 71));
        loginPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        jLogin.getContentPane().add(loginPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 320, 40));

        loginButton.setBackground(new java.awt.Color(163, 163, 181));
        loginButton.setForeground(new java.awt.Color(55, 55, 71));
        loginButton.setText("LOGIN: ");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 400, 320, 40));

        titleLogin.setBackground(new java.awt.Color(55, 55, 71));
        titleLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleLogin.setForeground(java.awt.Color.lightGray);
        titleLogin.setText("LOGIN SCREEN");
        jLogin.getContentPane().add(titleLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        switchFromLoginToAcctRecoveryButton.setBackground(new java.awt.Color(163, 163, 181));
        switchFromLoginToAcctRecoveryButton.setForeground(new java.awt.Color(55, 55, 71));
        switchFromLoginToAcctRecoveryButton.setText("Forgot Username or Password?");
        switchFromLoginToAcctRecoveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchFromLoginToAcctRecoveryButtonActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(switchFromLoginToAcctRecoveryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 320, -1));

        switchLoginToRegisterButton.setBackground(new java.awt.Color(163, 163, 181));
        switchLoginToRegisterButton.setForeground(new java.awt.Color(55, 55, 71));
        switchLoginToRegisterButton.setText("Don't have an account?");
        switchLoginToRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchLoginToRegisterButtonActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(switchLoginToRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 320, -1));

        backgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jLogin.getContentPane().add(backgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 380, 670));

        jRegistration.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleReg.setBackground(new java.awt.Color(55, 55, 71));
        titleReg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleReg.setForeground(java.awt.Color.lightGray);
        titleReg.setText("REGISTRATION SCREEN");
        jRegistration.getContentPane().add(titleReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        emailReg.setForeground(new java.awt.Color(229, 124, 0));
        emailReg.setText("Enter Email Address:");
        jRegistration.getContentPane().add(emailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        regEmailField.setBackground(new java.awt.Color(163, 163, 181));
        regEmailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        regEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmailFieldActionPerformed(evt);
            }
        });
        jRegistration.getContentPane().add(regEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 320, 40));

        usernameReg.setForeground(new java.awt.Color(229, 124, 0));
        usernameReg.setText("Enter Username: ");
        jRegistration.getContentPane().add(usernameReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        regUsernameField.setBackground(new java.awt.Color(163, 163, 181));
        regUsernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        jRegistration.getContentPane().add(regUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 320, 40));

        passwordReg.setForeground(new java.awt.Color(229, 124, 0));
        passwordReg.setText("Password: ");
        jRegistration.getContentPane().add(passwordReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        regPasswordField.setBackground(new java.awt.Color(163, 163, 181));
        regPasswordField.setForeground(new java.awt.Color(55, 55, 71));
        regPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        regPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPasswordFieldActionPerformed(evt);
            }
        });
        jRegistration.getContentPane().add(regPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 320, 40));

        verfiyPassword.setForeground(new java.awt.Color(229, 124, 0));
        verfiyPassword.setText("Verify Password:");
        jRegistration.getContentPane().add(verfiyPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        regVerifyPasswordField.setBackground(new java.awt.Color(163, 163, 181));
        regVerifyPasswordField.setForeground(new java.awt.Color(55, 55, 71));
        regVerifyPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        regVerifyPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regVerifyPasswordFieldActionPerformed(evt);
            }
        });
        jRegistration.getContentPane().add(regVerifyPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 320, 40));

        regRegisterButton.setBackground(new java.awt.Color(163, 163, 181));
        regRegisterButton.setForeground(new java.awt.Color(55, 55, 71));
        regRegisterButton.setText("REGISTER");
        regRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regRegisterButtonActionPerformed(evt);
            }
        });
        jRegistration.getContentPane().add(regRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, -1, 40));

        regBackButton.setBackground(new java.awt.Color(163, 163, 181));
        regBackButton.setForeground(new java.awt.Color(55, 55, 71));
        regBackButton.setText("Back");
        regBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBackButtonActionPerformed(evt);
            }
        });
        jRegistration.getContentPane().add(regBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, 40));

        backgroundRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jRegistration.getContentPane().add(backgroundRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLoginFail.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRecovery.setSize(backgroundRec.getMinimumSize());
        jRecovery.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleRecover.setBackground(new java.awt.Color(55, 55, 71));
        titleRecover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleRecover.setForeground(java.awt.Color.lightGray);
        titleRecover.setText("RECOVERY ");
        jRecovery.getContentPane().add(titleRecover, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        titleRecover.getAccessibleContext().setAccessibleName("");

        emRec.setForeground(new java.awt.Color(229, 124, 0));
        emRec.setText("Enter your Email Address:");
        jRecovery.getContentPane().add(emRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        recoveryEmailField.setBackground(new java.awt.Color(163, 163, 181));
        recoveryEmailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        recoveryEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoveryEmailFieldActionPerformed(evt);
            }
        });
        jRecovery.getContentPane().add(recoveryEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 260, 40));

        recoverySubmitButton.setForeground(new java.awt.Color(55, 55, 71));
        recoverySubmitButton.setText("SUBMIT");
        recoverySubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoverySubmitButtonActionPerformed(evt);
            }
        });
        jRecovery.getContentPane().add(recoverySubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, 40));

        recoveryBackButton.setForeground(new java.awt.Color(55, 55, 71));
        recoveryBackButton.setText("BACK");
        recoveryBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoveryBackButtonActionPerformed(evt);
            }
        });
        jRecovery.getContentPane().add(recoveryBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 40));

        backgroundRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jRecovery.getContentPane().add(backgroundRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jAccountSettings.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountChangePasswordButton.setBackground(new java.awt.Color(163, 163, 181));
        accountChangePasswordButton.setForeground(new java.awt.Color(55, 55, 71));
        accountChangePasswordButton.setText("CHANGE PASSWORD");
        jAccountSettings.getContentPane().add(accountChangePasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 230, 70));

        accountContactSuppButton.setBackground(new java.awt.Color(163, 163, 181));
        accountContactSuppButton.setForeground(new java.awt.Color(55, 55, 71));
        accountContactSuppButton.setText("CONTACT SUPPORT");
        jAccountSettings.getContentPane().add(accountContactSuppButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 230, 70));

        accountDeleteAccountButton.setBackground(new java.awt.Color(163, 163, 181));
        accountDeleteAccountButton.setForeground(new java.awt.Color(55, 55, 71));
        accountDeleteAccountButton.setText("DELETE ACCOUNT");
        jAccountSettings.getContentPane().add(accountDeleteAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 230, 70));

        accountBackButton.setBackground(new java.awt.Color(163, 163, 181));
        accountBackButton.setForeground(new java.awt.Color(55, 55, 71));
        accountBackButton.setText("BACK");
        accountBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBackButtonActionPerformed(evt);
            }
        });
        jAccountSettings.getContentPane().add(accountBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, 40));

        titleAS.setBackground(new java.awt.Color(55, 55, 71));
        titleAS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleAS.setForeground(java.awt.Color.lightGray);
        titleAS.setText("ACCOUNT SETTINGS");
        jAccountSettings.getContentPane().add(titleAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        backgroundAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jAccountSettings.getContentPane().add(backgroundAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 666));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void switchFromHomeToRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchFromHomeToRoomsButtonActionPerformed
//       userControl.chatRooms();
       jHomeScreen.pack();
       jHomeScreen.setVisible(true);
    }//GEN-LAST:event_switchFromHomeToRoomsButtonActionPerformed

    //Go from the home screen to the account settings screen
    private void switchFromHomeToAccountSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchFromHomeToAccountSettingsButtonActionPerformed
        jHomeScreen.setVisible(false);
        jAccountSettings.pack();
        jAccountSettings.setVisible(true);           
        //userControl.accountSetting();
    }//GEN-LAST:event_switchFromHomeToAccountSettingsButtonActionPerformed

    //Moves from the login window to the registration window
    private void switchLoginToRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchLoginToRegisterButtonActionPerformed
        jLogin.setVisible(false);
        jRegistration.pack();
        jRegistration.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_switchLoginToRegisterButtonActionPerformed

    //Move from the home screen to the OneToOne screen
    private void switchFromHomeToOneToOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchFromHomeToOneToOneButtonActionPerformed
        jHomeScreen.setVisible(false);
        jOnetoOne.pack();
        jOnetoOne.setVisible(true);   
    }//GEN-LAST:event_switchFromHomeToOneToOneButtonActionPerformed

    //Goes back from the OneToOne screen to the home screen
    private void chatBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatBackButtonActionPerformed
       jOnetoOne.setVisible(false);
       jHomeScreen.pack();
       jHomeScreen.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_chatBackButtonActionPerformed

    private void loginUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsernameFieldActionPerformed

    private void regEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmailFieldActionPerformed

    private void chatSendMessageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatSendMessageBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chatSendMessageBoxActionPerformed

    private void recoveryEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoveryEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recoveryEmailFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LoginWindow checkLogin = new LoginWindow(GUIprogram.this);
        if(controller.loginRequest(checkLogin.getUserName(),checkLogin.getPassword())){
        jLogin.setVisible(false);
        jHomeScreen.pack();
        jHomeScreen.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, 
                    "Wrong Username or Password",
                    "Invalid Credentials" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void switchFromLoginToAcctRecoveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchFromLoginToAcctRecoveryButtonActionPerformed
        jLogin.setVisible(false);
        jRecovery.pack();   
        jRecovery.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_switchFromLoginToAcctRecoveryButtonActionPerformed

    private void homeBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBackButtonActionPerformed
        jHomeScreen.setVisible(false);
        jLogin.pack();
        jLogin.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_homeBackButtonActionPerformed

    private void recoveryBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoveryBackButtonActionPerformed
        jRecovery.setVisible(false);
        jLogin.pack();
        jLogin.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_recoveryBackButtonActionPerformed

    private void accountBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountBackButtonActionPerformed
        jAccountSettings.setVisible(false);
        jHomeScreen.pack();
        jHomeScreen.setVisible(true);
    }//GEN-LAST:event_accountBackButtonActionPerformed

    private void regPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPasswordFieldActionPerformed

    private void regVerifyPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regVerifyPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regVerifyPasswordFieldActionPerformed

    private void chatSendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatSendButtonActionPerformed
        controller.sendMessage(getSentMessage());
        messageSent(true);
    }//GEN-LAST:event_chatSendButtonActionPerformed

    private void recoverySubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoverySubmitButtonActionPerformed
        recoverPasswordPressed(true);
        String password = controller.accountRecovery(getRecoveryEmail());
        JOptionPane.showMessageDialog(this, 
                    "Your password is: "+password,
                    "Recovered Password" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_recoverySubmitButtonActionPerformed

    private void regRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regRegisterButtonActionPerformed
        controller.registerRequest(getUserNameRegistered(), getEmailRegistered(), getPasswordRegistered());
        
        registerPressed(true);
        
        JOptionPane.showMessageDialog(this,"Emailed Registration Information\nCheck your email for username and password", 
                        "Registration Email Sent", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_regRegisterButtonActionPerformed

    private void portTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portTFActionPerformed

    private void oneToOneConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneToOneConnectButtonActionPerformed
        connectionButtonPressed(true);
        //MessagePanel connection = new MessagePanel();
//        if(connection.getStatus()==false) {
//            JOptionPane.showMessageDialog(this, "No Connection", "Connection Fail!", JOptionPane.ERROR_MESSAGE);
//        }
//        else{
           
            JOptionPane.showMessageDialog(this, 
                    "Connection Successful!\n\nConnection:\t"+ipaddTF.getText()+": "+portTF.getText()+
                    "\n\nIP Address:\t"+ipaddTF.getText()+
                    "\nPort Number:\t"+portTF.getText(), 
                    "Success!" , JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_oneToOneConnectButtonActionPerformed

    private void regBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBackButtonActionPerformed
        jRegistration.setVisible(false);
        jLogin.pack();
        jLogin.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_regBackButtonActionPerformed

    //Constructor
    
//    public static void main(String args[]) {
//       
//    
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            GUIprogram guIprogram = new GUIprogram();
//        });
//    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountBackButton;
    private javax.swing.JButton accountChangePasswordButton;
    private javax.swing.JButton accountContactSuppButton;
    private javax.swing.JButton accountDeleteAccountButton;
    private javax.swing.JLabel background1to1;
    private javax.swing.JLabel backgroundAS;
    private javax.swing.JLabel backgroundHomeScreen;
    private javax.swing.JLabel backgroundLogin;
    private javax.swing.JLabel backgroundRec;
    private javax.swing.JLabel backgroundRegistration;
    private javax.swing.JButton chatBackButton;
    private javax.swing.JButton chatSendButton;
    private javax.swing.JTextField chatSendMessageBox;
    private javax.swing.JLabel emRec;
    private javax.swing.JLabel emailReg;
    private javax.swing.JButton homeBackButton;
    private javax.swing.JLabel ipAdd;
    private javax.swing.JTextField ipaddTF;
    private javax.swing.JDialog jAccountSettings;
    private javax.swing.JDialog jHomeScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JDialog jLogin;
    private javax.swing.JDialog jLoginFail;
    private javax.swing.JDialog jOnetoOne;
    private javax.swing.JDialog jRecovery;
    private javax.swing.JDialog jRegistration;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JTextField loginUsernameField;
    private javax.swing.JTextArea messageTextWindow;
    private javax.swing.JButton oneToOneConnectButton;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordReg;
    private javax.swing.JLabel port;
    private javax.swing.JTextField portTF;
    private javax.swing.JButton recoveryBackButton;
    private javax.swing.JTextField recoveryEmailField;
    private javax.swing.JButton recoverySubmitButton;
    private javax.swing.JButton regBackButton;
    private javax.swing.JTextField regEmailField;
    private javax.swing.JPasswordField regPasswordField;
    private javax.swing.JButton regRegisterButton;
    private javax.swing.JTextField regUsernameField;
    private javax.swing.JPasswordField regVerifyPasswordField;
    private javax.swing.JButton switchFromHomeToAccountSettingsButton;
    private javax.swing.JButton switchFromHomeToOneToOneButton;
    private javax.swing.JButton switchFromHomeToRoomsButton;
    private javax.swing.JButton switchFromLoginToAcctRecoveryButton;
    private javax.swing.JButton switchLoginToRegisterButton;
    private javax.swing.JLabel titleAS;
    private javax.swing.JLabel titleHomeScreen;
    private javax.swing.JLabel titleLogin;
    private javax.swing.JLabel titleRecover;
    private javax.swing.JLabel titleReg;
    private javax.swing.JLabel username;
    private javax.swing.JLabel usernameReg;
    private javax.swing.JLabel verfiyPassword;
    // End of variables declaration//GEN-END:variables


    
    public String getSentM(){
        String message = chatSendMessageBox.getText();
        return message;
    }
    
    public String getUserName(){
        String message = loginUsernameField.getText();
        return message;
    }
    
    public char[] getPassword(){
        char[] message = loginPasswordField.getPassword();
        return message;
    }
    
    public String getRecoveryEmail(){
        String message = recoveryEmailField.getText();
        return message;
    }
    
    public String getEmailRegistered(){
        String message = regEmailField.getText();
        return message;
    }
    public String getUserNameRegistered(){
        String message = regUsernameField.getText();
        return message;
    }
    
    public String getPasswordRegistered(){
        char[] pwdArray = regPasswordField.getPassword();
        String password = "";
        for(char ch: pwdArray){
            password +=ch;
        }
        return password;
    }
    
    public void receiveMessage(String message){
        messageTextWindow.setText(messageTextWindow.getText()+"\n"+message);
    }
    
    public char[] getPasswordVerifyRegistered(){
        char[] pwdArray = regVerifyPasswordField.getPassword();
        return pwdArray;
    }
    
    public String getSentMessage(){
        String sentMessage = chatSendMessageBox.getText();
        return sentMessage;
    }    
    
    public String getIP(){
        String ipAddress = ipaddTF.getText();
        return ipAddress;
    }
    
    public String getPort(){
        String portNum = portTF.getText();
        return portNum;
    }
    
    public boolean recoverPasswordPressed(boolean pressed){
        return pressed;
    }
    public boolean registerPressed(boolean pressed){
        return pressed;
    }
    
    public boolean messageSent(boolean pressed){
        return pressed;
    }
    
    public boolean connectionButtonPressed(boolean pressed){
        return pressed;
    }
    
    
}