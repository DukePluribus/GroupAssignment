import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class GUIprogram extends javax.swing.JFrame {

    private Controller controller;

    public void displayPrompt() {
        JOptionPane.showMessageDialog(this, "Incorrect Username or Password", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
    }

    public GUIprogram(Controller _controller) {
        controller = _controller;
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        }
        initComponents();
        jLogin.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jHomeScreen = new javax.swing.JDialog();
        switchFromHomeToOneToOneButton = new javax.swing.JButton();
        switchFromHomeToGroupChatButton = new javax.swing.JButton();
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
        accountDeleteAccountButton = new javax.swing.JButton();
        accountBackButton = new javax.swing.JButton();
        titleAS = new javax.swing.JLabel();
        backgroundAS = new javax.swing.JLabel();
        jChangePassword = new javax.swing.JDialog();
        titleHomeScreen1 = new javax.swing.JLabel();
        usernameChangePassword = new javax.swing.JLabel();
        loginUsernameField1 = new javax.swing.JTextField();
        newPassword = new javax.swing.JLabel();
        loginPasswordField1 = new javax.swing.JPasswordField();
        changePasswordSubmit = new javax.swing.JButton();
        changePasswordBack = new javax.swing.JButton();
        backgroundChangePassword = new javax.swing.JLabel();
        jGroupChat = new javax.swing.JDialog();
        chatSendMessageBoxGroupChat = new javax.swing.JTextField();
        chatSendButtonGroupChat = new javax.swing.JButton();
        chatBackButtonGroupChat = new javax.swing.JButton();
        titleGroupChat = new javax.swing.JLabel();
        ipAddGroupChat = new javax.swing.JLabel();
        ipaddTFGroupChat = new javax.swing.JTextField();
        portTFGroupChat = new javax.swing.JTextField();
        portGroupChat = new javax.swing.JLabel();
        oneToOneConnectButtonGroupChat = new javax.swing.JButton();
        jScrollPaneGroupChat = new javax.swing.JScrollPane();
        messageTextWindowGroupChat = new javax.swing.JTextArea();
        backgroundGroupChat = new javax.swing.JLabel();
        jDeleteAccount = new javax.swing.JDialog();
        titleDeleteAccount = new javax.swing.JLabel();
        usernameDeleteAccount = new javax.swing.JLabel();
        usernameDeleteAccountTextField = new javax.swing.JTextField();
        passwordDeleteAccount = new javax.swing.JLabel();
        passwordDeleteAccountTextField = new javax.swing.JPasswordField();
        deleteAccountButton = new javax.swing.JButton();
        cancelDeleteAccountButton = new javax.swing.JButton();
        backgroundDeleteAccount = new javax.swing.JLabel();
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
        switchFromHomeToGroupChatButton.setBackground(new java.awt.Color(163, 163, 181));
        switchFromHomeToGroupChatButton.setForeground(new java.awt.Color(55, 55, 71));
        switchFromHomeToGroupChatButton.setText("GROUP CHAT");
        switchFromHomeToGroupChatButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchFromHomeToGroupChatButtonActionPerformed(evt);
            }
        });
        jHomeScreen.getContentPane().add(switchFromHomeToGroupChatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 230, 70));
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
        titleHomeScreen.setFont(new java.awt.Font("Arial", 1, 14));
        titleHomeScreen.setForeground(java.awt.Color.lightGray);
        titleHomeScreen.setText("WELCOME");
        jHomeScreen.getContentPane().add(titleHomeScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        backgroundHomeScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png")));
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
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14));
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
        background1to1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png")));
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
        titleLogin.setFont(new java.awt.Font("Arial", 1, 14));
        titleLogin.setForeground(java.awt.Color.lightGray);
        titleLogin.setText("LOGIN SCREEN");
        jLogin.getContentPane().add(titleLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        switchFromLoginToAcctRecoveryButton.setBackground(new java.awt.Color(163, 163, 181));
        switchFromLoginToAcctRecoveryButton.setForeground(new java.awt.Color(55, 55, 71));
        switchFromLoginToAcctRecoveryButton.setText("Password Recovery");
        switchFromLoginToAcctRecoveryButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchFromLoginToAcctRecoveryButtonActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(switchFromLoginToAcctRecoveryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 320, -1));
        switchLoginToRegisterButton.setBackground(new java.awt.Color(163, 163, 181));
        switchLoginToRegisterButton.setForeground(new java.awt.Color(55, 55, 71));
        switchLoginToRegisterButton.setText("Register");
        switchLoginToRegisterButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchLoginToRegisterButtonActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(switchLoginToRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 320, -1));
        backgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png")));
        jLogin.getContentPane().add(backgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 380, 670));
        jRegistration.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        titleReg.setBackground(new java.awt.Color(55, 55, 71));
        titleReg.setFont(new java.awt.Font("Arial", 1, 14));
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
        backgroundRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png")));
        jRegistration.getContentPane().add(backgroundRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jLoginFail.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jRecovery.setSize(backgroundRec.getMinimumSize());
        jRecovery.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        titleRecover.setBackground(new java.awt.Color(55, 55, 71));
        titleRecover.setFont(new java.awt.Font("Arial", 1, 14));
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
        backgroundRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png")));
        jRecovery.getContentPane().add(backgroundRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jAccountSettings.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        accountChangePasswordButton.setBackground(new java.awt.Color(163, 163, 181));
        accountChangePasswordButton.setForeground(new java.awt.Color(55, 55, 71));
        accountChangePasswordButton.setText("CHANGE PASSWORD");
        accountChangePasswordButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountChangePasswordButtonActionPerformed(evt);
            }
        });
        jAccountSettings.getContentPane().add(accountChangePasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 230, 70));
        accountDeleteAccountButton.setBackground(new java.awt.Color(163, 163, 181));
        accountDeleteAccountButton.setForeground(new java.awt.Color(55, 55, 71));
        accountDeleteAccountButton.setText("DELETE ACCOUNT");
        accountDeleteAccountButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountDeleteAccountButtonActionPerformed(evt);
            }
        });
        jAccountSettings.getContentPane().add(accountDeleteAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 230, 70));
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
        titleAS.setFont(new java.awt.Font("Arial", 1, 14));
        titleAS.setForeground(java.awt.Color.lightGray);
        titleAS.setText("ACCOUNT SETTINGS");
        jAccountSettings.getContentPane().add(titleAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        backgroundAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png")));
        jAccountSettings.getContentPane().add(backgroundAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jChangePassword.setMinimumSize(new java.awt.Dimension(400, 720));
        jChangePassword.setPreferredSize(new java.awt.Dimension(400, 720));
        jChangePassword.setSize(backgroundChangePassword.getPreferredSize());
        jChangePassword.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        titleHomeScreen1.setBackground(new java.awt.Color(55, 55, 71));
        titleHomeScreen1.setFont(new java.awt.Font("Arial", 1, 14));
        titleHomeScreen1.setForeground(java.awt.Color.lightGray);
        titleHomeScreen1.setText("CHANGE PASSWORD");
        jChangePassword.getContentPane().add(titleHomeScreen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        usernameChangePassword.setForeground(new java.awt.Color(229, 124, 0));
        usernameChangePassword.setText("Username: ");
        jChangePassword.getContentPane().add(usernameChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        loginUsernameField1.setBackground(new java.awt.Color(163, 163, 181));
        loginUsernameField1.setForeground(new java.awt.Color(55, 55, 71));
        loginUsernameField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        loginUsernameField1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameField1ActionPerformed(evt);
            }
        });
        jChangePassword.getContentPane().add(loginUsernameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 320, 40));
        newPassword.setForeground(new java.awt.Color(229, 124, 0));
        newPassword.setText("New Password:");
        jChangePassword.getContentPane().add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        loginPasswordField1.setBackground(new java.awt.Color(163, 163, 181));
        loginPasswordField1.setForeground(new java.awt.Color(55, 55, 71));
        loginPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        jChangePassword.getContentPane().add(loginPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 320, 40));
        changePasswordSubmit.setForeground(new java.awt.Color(55, 55, 71));
        changePasswordSubmit.setText("SUBMIT");
        changePasswordSubmit.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordSubmitActionPerformed(evt);
            }
        });
        jChangePassword.getContentPane().add(changePasswordSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, -1, 40));
        changePasswordBack.setBackground(new java.awt.Color(163, 163, 181));
        changePasswordBack.setForeground(new java.awt.Color(55, 55, 71));
        changePasswordBack.setText("BACK");
        changePasswordBack.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordBackActionPerformed(evt);
            }
        });
        jChangePassword.getContentPane().add(changePasswordBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, 40));
        backgroundChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplication1/pictures/background_simple_smaller.png")));
        backgroundChangePassword.setToolTipText("");
        jChangePassword.getContentPane().add(backgroundChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jGroupChat.setMinimumSize(new java.awt.Dimension(385, 700));
        jGroupChat.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        chatSendMessageBoxGroupChat.setBackground(new java.awt.Color(163, 163, 181));
        chatSendMessageBoxGroupChat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        chatSendMessageBoxGroupChat.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatSendMessageBoxGroupChatActionPerformed(evt);
            }
        });
        jGroupChat.getContentPane().add(chatSendMessageBoxGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 260, 30));
        chatSendButtonGroupChat.setBackground(new java.awt.Color(163, 163, 181));
        chatSendButtonGroupChat.setForeground(new java.awt.Color(55, 55, 71));
        chatSendButtonGroupChat.setText("ENTER");
        chatSendButtonGroupChat.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatSendButtonGroupChatActionPerformed(evt);
            }
        });
        jGroupChat.getContentPane().add(chatSendButtonGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, -1, 30));
        chatBackButtonGroupChat.setBackground(new java.awt.Color(163, 163, 181));
        chatBackButtonGroupChat.setForeground(new java.awt.Color(55, 55, 71));
        chatBackButtonGroupChat.setText("BACK");
        chatBackButtonGroupChat.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatBackButtonGroupChatActionPerformed(evt);
            }
        });
        jGroupChat.getContentPane().add(chatBackButtonGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 340, -1));
        titleGroupChat.setBackground(new java.awt.Color(55, 55, 71));
        titleGroupChat.setFont(new java.awt.Font("Arial", 1, 14));
        titleGroupChat.setForeground(java.awt.Color.lightGray);
        titleGroupChat.setText("GROUP CHAT");
        jGroupChat.getContentPane().add(titleGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        ipAddGroupChat.setForeground(new java.awt.Color(229, 124, 0));
        ipAddGroupChat.setText("IP Address:");
        jGroupChat.getContentPane().add(ipAddGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        ipaddTFGroupChat.setBackground(new java.awt.Color(163, 163, 181));
        ipaddTFGroupChat.setForeground(new java.awt.Color(55, 55, 71));
        ipaddTFGroupChat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        jGroupChat.getContentPane().add(ipaddTFGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 30));
        portTFGroupChat.setBackground(new java.awt.Color(163, 163, 181));
        portTFGroupChat.setForeground(new java.awt.Color(55, 55, 71));
        portTFGroupChat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        portTFGroupChat.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portTFGroupChatActionPerformed(evt);
            }
        });
        jGroupChat.getContentPane().add(portTFGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 60, 30));
        portGroupChat.setForeground(new java.awt.Color(229, 124, 0));
        portGroupChat.setText("Port:");
        jGroupChat.getContentPane().add(portGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));
        oneToOneConnectButtonGroupChat.setBackground(new java.awt.Color(163, 163, 181));
        oneToOneConnectButtonGroupChat.setForeground(new java.awt.Color(55, 55, 71));
        oneToOneConnectButtonGroupChat.setText("CONNECT");
        oneToOneConnectButtonGroupChat.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneToOneConnectButtonGroupChatActionPerformed(evt);
            }
        });
        jGroupChat.getContentPane().add(oneToOneConnectButtonGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, 30));
        jScrollPaneGroupChat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0), 3));
        messageTextWindowGroupChat.setBackground(new java.awt.Color(163, 163, 181));
        messageTextWindowGroupChat.setColumns(20);
        messageTextWindowGroupChat.setRows(5);
        messageTextWindowGroupChat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPaneGroupChat.setViewportView(messageTextWindowGroupChat);
        jGroupChat.getContentPane().add(jScrollPaneGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 330));
        backgroundGroupChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png")));
        jGroupChat.getContentPane().add(backgroundGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jDeleteAccount.setMinimumSize(new java.awt.Dimension(400, 720));
        jDeleteAccount.setPreferredSize(new java.awt.Dimension(400, 720));
        jDeleteAccount.setSize(backgroundChangePassword.getPreferredSize());
        jDeleteAccount.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        titleDeleteAccount.setBackground(new java.awt.Color(55, 55, 71));
        titleDeleteAccount.setFont(new java.awt.Font("Arial", 1, 14));
        titleDeleteAccount.setForeground(java.awt.Color.lightGray);
        titleDeleteAccount.setText("DELETE ACCOUNT");
        jDeleteAccount.getContentPane().add(titleDeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        usernameDeleteAccount.setForeground(new java.awt.Color(229, 124, 0));
        usernameDeleteAccount.setText("Username: ");
        jDeleteAccount.getContentPane().add(usernameDeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        usernameDeleteAccountTextField.setBackground(new java.awt.Color(163, 163, 181));
        usernameDeleteAccountTextField.setForeground(new java.awt.Color(55, 55, 71));
        usernameDeleteAccountTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        usernameDeleteAccountTextField.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameDeleteAccountTextFieldActionPerformed(evt);
            }
        });
        jDeleteAccount.getContentPane().add(usernameDeleteAccountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 320, 40));
        passwordDeleteAccount.setForeground(new java.awt.Color(229, 124, 0));
        passwordDeleteAccount.setText("Password:");
        jDeleteAccount.getContentPane().add(passwordDeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        passwordDeleteAccountTextField.setBackground(new java.awt.Color(163, 163, 181));
        passwordDeleteAccountTextField.setForeground(new java.awt.Color(55, 55, 71));
        passwordDeleteAccountTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        jDeleteAccount.getContentPane().add(passwordDeleteAccountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 320, 40));
        deleteAccountButton.setForeground(new java.awt.Color(55, 55, 71));
        deleteAccountButton.setText("DELETE ACCOUNT");
        deleteAccountButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButtonActionPerformed(evt);
            }
        });
        jDeleteAccount.getContentPane().add(deleteAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 320, 40));
        cancelDeleteAccountButton.setBackground(new java.awt.Color(163, 163, 181));
        cancelDeleteAccountButton.setForeground(new java.awt.Color(55, 55, 71));
        cancelDeleteAccountButton.setText("CANCEL");
        cancelDeleteAccountButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelDeleteAccountButtonActionPerformed(evt);
            }
        });
        jDeleteAccount.getContentPane().add(cancelDeleteAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, 40));
        backgroundDeleteAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplication1/pictures/background_simple_smaller.png")));
        backgroundDeleteAccount.setToolTipText("");
        jDeleteAccount.getContentPane().add(backgroundDeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 666));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
        pack();
    }

    private void switchFromHomeToGroupChatButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jHomeScreen.setVisible(false);
        jGroupChat.pack();
        jGroupChat.setVisible(true);
    }

    private void switchFromHomeToAccountSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jHomeScreen.setVisible(false);
        jAccountSettings.pack();
        jAccountSettings.setVisible(true);
    }

    private void switchLoginToRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jLogin.setVisible(false);
        jRegistration.pack();
        jRegistration.setVisible(true);
    }

    private void switchFromHomeToOneToOneButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jHomeScreen.setVisible(false);
        jOnetoOne.pack();
        jOnetoOne.setVisible(true);
    }

    private void chatBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jOnetoOne.setVisible(false);
        jHomeScreen.pack();
        jHomeScreen.setVisible(true);
    }

    private void loginUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void regEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void chatSendMessageBoxActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void recoveryEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        LoginWindow checkLogin = new LoginWindow(GUIprogram.this);
        if (controller.loginRequest(checkLogin.getUserName(), checkLogin.getPassword())) {
            jLogin.setVisible(false);
            jHomeScreen.pack();
            jHomeScreen.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Wrong Username or Password", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void switchFromLoginToAcctRecoveryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jLogin.setVisible(false);
        jRecovery.pack();
        jRecovery.setVisible(true);
    }

    private void homeBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jHomeScreen.setVisible(false);
        jLogin.pack();
        jLogin.setVisible(true);
    }

    private void recoveryBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jRecovery.setVisible(false);
        jLogin.pack();
        jLogin.setVisible(true);
    }

    private void accountBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jAccountSettings.setVisible(false);
        jHomeScreen.pack();
        jHomeScreen.setVisible(true);
    }

    private void regPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void regVerifyPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void chatSendButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.sendMessage(getSentMessage());
        messageSent(true);
    }

    private void recoverySubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        recoverPasswordPressed(true);
        String password = controller.accountRecovery(getRecoveryEmail());
        recoverPassword(recoveryEmailField.getText());
        JOptionPane.showMessageDialog(this, "Your password is: " + password, "Recovered Password", JOptionPane.INFORMATION_MESSAGE);
    }

    private void regRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.registerRequest(getUserNameRegistered(), getEmailRegistered(), getPasswordRegistered());
        registerPressed(true);
        JOptionPane.showMessageDialog(this, "Emailed Registration Information\nCheck your email for username and password", "Registration Email Sent", JOptionPane.INFORMATION_MESSAGE);
    }

    private void portTFActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void oneToOneConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        connectionButtonPressed(true);
        JOptionPane.showMessageDialog(this, "Connection Successful!\n\nConnection:\t" + ipaddTF.getText() + ": " + portTF.getText() + "\n\nIP Address:\t" + ipaddTF.getText() + "\nPort Number:\t" + portTF.getText(), "Success!", JOptionPane.INFORMATION_MESSAGE);
    }

    private void regBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jRegistration.setVisible(false);
        jLogin.pack();
        jLogin.setVisible(true);
    }

    private void loginUsernameField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void changePasswordSubmitActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Password has been updated successfully.", "Success!", JOptionPane.INFORMATION_MESSAGE);
    }

    private void changePasswordBackActionPerformed(java.awt.event.ActionEvent evt) {
        jChangePassword.setVisible(false);
        jAccountSettings.setVisible(true);
    }

    private void accountChangePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jAccountSettings.setVisible(false);
        jChangePassword.setVisible(true);
    }

    private void chatSendMessageBoxGroupChatActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void chatSendButtonGroupChatActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void chatBackButtonGroupChatActionPerformed(java.awt.event.ActionEvent evt) {
        jGroupChat.setVisible(false);
        jHomeScreen.pack();
        jHomeScreen.setVisible(true);
    }

    private void portTFGroupChatActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void oneToOneConnectButtonGroupChatActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void usernameDeleteAccountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int warning = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete your account?", "Warning!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if (warning == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(this, "Your account has been deleted", "Account Deleted", JOptionPane.INFORMATION_MESSAGE);
            jDeleteAccount.setVisible(false);
            jLogin.pack();
            jLogin.setVisible(true);
        } else if (warning == JOptionPane.CANCEL_OPTION) {
            jDeleteAccount.setVisible(false);
            jAccountSettings.pack();
            jAccountSettings.setVisible(true);
        }
    }

    private void cancelDeleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jDeleteAccount.setVisible(false);
        jAccountSettings.pack();
        jAccountSettings.setVisible(true);
    }

    private void accountDeleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jAccountSettings.setVisible(false);
        jDeleteAccount.pack();
        jDeleteAccount.setVisible(true);
    }

    private javax.swing.JButton accountBackButton;

    private javax.swing.JButton accountChangePasswordButton;

    private javax.swing.JButton accountDeleteAccountButton;

    private javax.swing.JLabel background1to1;

    private javax.swing.JLabel backgroundAS;

    private javax.swing.JLabel backgroundChangePassword;

    private javax.swing.JLabel backgroundDeleteAccount;

    private javax.swing.JLabel backgroundGroupChat;

    private javax.swing.JLabel backgroundHomeScreen;

    private javax.swing.JLabel backgroundLogin;

    private javax.swing.JLabel backgroundRec;

    private javax.swing.JLabel backgroundRegistration;

    private javax.swing.JButton cancelDeleteAccountButton;

    private javax.swing.JButton changePasswordBack;

    private javax.swing.JButton changePasswordSubmit;

    private javax.swing.JButton chatBackButton;

    private javax.swing.JButton chatBackButtonGroupChat;

    private javax.swing.JButton chatSendButton;

    private javax.swing.JButton chatSendButtonGroupChat;

    private javax.swing.JTextField chatSendMessageBox;

    private javax.swing.JTextField chatSendMessageBoxGroupChat;

    private javax.swing.JButton deleteAccountButton;

    private javax.swing.JLabel emRec;

    private javax.swing.JLabel emailReg;

    private javax.swing.JButton homeBackButton;

    private javax.swing.JLabel ipAdd;

    private javax.swing.JLabel ipAddGroupChat;

    private javax.swing.JTextField ipaddTF;

    private javax.swing.JTextField ipaddTFGroupChat;

    private javax.swing.JDialog jAccountSettings;

    private javax.swing.JDialog jChangePassword;

    private javax.swing.JDialog jDeleteAccount;

    private javax.swing.JDialog jGroupChat;

    private javax.swing.JDialog jHomeScreen;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JDialog jLogin;

    private javax.swing.JDialog jLoginFail;

    private javax.swing.JDialog jOnetoOne;

    private javax.swing.JDialog jRecovery;

    private javax.swing.JDialog jRegistration;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JScrollPane jScrollPaneGroupChat;

    private javax.swing.JButton loginButton;

    private javax.swing.JPasswordField loginPasswordField;

    private javax.swing.JPasswordField loginPasswordField1;

    private javax.swing.JTextField loginUsernameField;

    private javax.swing.JTextField loginUsernameField1;

    private javax.swing.JTextArea messageTextWindow;

    private javax.swing.JTextArea messageTextWindowGroupChat;

    private javax.swing.JLabel newPassword;

    private javax.swing.JButton oneToOneConnectButton;

    private javax.swing.JButton oneToOneConnectButtonGroupChat;

    private javax.swing.JLabel password;

    private javax.swing.JLabel passwordDeleteAccount;

    private javax.swing.JPasswordField passwordDeleteAccountTextField;

    private javax.swing.JLabel passwordReg;

    private javax.swing.JLabel port;

    private javax.swing.JLabel portGroupChat;

    private javax.swing.JTextField portTF;

    private javax.swing.JTextField portTFGroupChat;

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

    private javax.swing.JButton switchFromHomeToGroupChatButton;

    private javax.swing.JButton switchFromHomeToOneToOneButton;

    private javax.swing.JButton switchFromLoginToAcctRecoveryButton;

    private javax.swing.JButton switchLoginToRegisterButton;

    private javax.swing.JLabel titleAS;

    private javax.swing.JLabel titleDeleteAccount;

    private javax.swing.JLabel titleGroupChat;

    private javax.swing.JLabel titleHomeScreen;

    private javax.swing.JLabel titleHomeScreen1;

    private javax.swing.JLabel titleLogin;

    private javax.swing.JLabel titleRecover;

    private javax.swing.JLabel titleReg;

    private javax.swing.JLabel username;

    private javax.swing.JLabel usernameChangePassword;

    private javax.swing.JLabel usernameDeleteAccount;

    private javax.swing.JTextField usernameDeleteAccountTextField;

    private javax.swing.JLabel usernameReg;

    private javax.swing.JLabel verfiyPassword;

    public String getSentM() {
        String message = chatSendMessageBoxGroupChat.getText();
        return message;
    }

    public String getUserName() {
        String message = loginUsernameField.getText();
        return message;
    }

    public char[] getPassword() {
        char[] message = loginPasswordField.getPassword();
        return message;
    }

    public String getRecoveryEmail() {
        String message = recoveryEmailField.getText();
        return message;
    }

    public String getEmailRegistered() {
        String message = regEmailField.getText();
        return message;
    }

    public String getUserNameRegistered() {
        String message = regUsernameField.getText();
        return message;
    }

    public String getPasswordRegistered() {
        char[] pwdArray = regPasswordField.getPassword();
        String password = "";
        for (char ch : pwdArray) {
            password += ch;
        }
        return password;
    }

    public void receiveMessage(String message) {
        messageTextWindowGroupChat.setText(messageTextWindowGroupChat.getText() + "\n" + message);
    }

    public char[] getPasswordVerifyRegistered() {
        char[] pwdArray = regVerifyPasswordField.getPassword();
        return pwdArray;
    }

    public String getSentMessage() {
        String sentMessage = chatSendMessageBoxGroupChat.getText();
        return sentMessage;
    }

    public String getIP() {
        String ipAddress = ipaddTF.getText();
        return ipAddress;
    }

    public String getPort() {
        String portNum = portTF.getText();
        return portNum;
    }

    public String recoverPassword(String email) {
        return email;
    }

    public String deleteAccount(String uname, String pwd) {
        return uname + pwd;
    }

    public String changePassword(String uname, String newPwd) {
        return uname + newPwd;
    }

    public boolean recoverPasswordPressed(boolean pressed) {
        return pressed;
    }

    public boolean registerPressed(boolean pressed) {
        return pressed;
    }

    public boolean messageSent(boolean pressed) {
        return pressed;
    }

    public boolean connectionButtonPressed(boolean pressed) {
        return pressed;
    }

  
}
