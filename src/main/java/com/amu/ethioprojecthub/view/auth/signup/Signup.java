/*
 * Created by JFormDesigner on Fri Feb 10 23:47:11 EAT 2023
 */

package com.amu.ethioprojecthub.view.auth.signup;

import com.amu.ethioprojecthub.controller.AuthController;
import com.amu.ethioprojecthub.controller.SignupListner;
import com.amu.ethioprojecthub.model.User;
import com.amu.ethioprojecthub.view.MainFrame;
import com.amu.ethioprojecthub.view.home.Home;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author tekle
 */
public class Signup extends JPanel {
    AuthController authController;
    private MainFrame mainFrame;
    private User user = new User();
    private SignupListner signupListner;
    private Home home;
    public Signup(MainFrame mainFrame,SignupListner signupListner) throws SQLException {
        this.authController = new AuthController();
        this.signupListner = signupListner;
        this.mainFrame = mainFrame;
        initComponents();
    }

    private void signup(ActionEvent e) throws IOException, SQLException {
        String name  = nameField.getText();
        String phoneNumber = pnum.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(name);
        user.setPhoneNumber(phoneNumber);

        User success = authController.register(user);
        if(!success.equals(null)){
            signupListner.onSignupSuccess(success);
        } else {
            signupListner.onSignupFailure("Signup failed");
        }

    }

    private void login(ActionEvent e) {
        mainFrame.showLogin();
    }

    private void initComponents( ) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Tekletsadik A
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        panel3 = new JPanel();
        loginForm = new JPanel();
        logo = new JLabel();
        nameabel = compFactory.createLabel("name");
        nameField = new JFormattedTextField();
        emailLabel = compFactory.createLabel("email");
        emailField = new JFormattedTextField();
        label3 = compFactory.createLabel("phone");
        pnum = new JFormattedTextField();
        label1 = compFactory.createLabel("Password");
        passwordField = new JPasswordField();
        loginBtn = new JButton();
        button2 = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(534, 734));
        setMinimumSize(new Dimension(500, 700));

        setLayout(new MigLayout(
            "hidemode 3,align center center",
            // columns
            "[631,fill]",
            // rows
            "[628]" +
            "[]"));

        //======== panel3 ========
        {
            panel3.setForeground(new Color(0xf5f5f5));
            panel3.setLayout(new MigLayout(
                "insets 0,hidemode 3",
                // columns
                "[fill]",
                // rows
                "[fill]"));

            //======== loginForm ========
            {
                loginForm.setLayout(new MigLayout(
                    "insets 0,hidemode 3,gap 5 5",
                    // columns
                    "[fill]",
                    // rows
                    "[fill]" +
                    "[fill]" +
                    "[40,fill]" +
                    "[5]0" +
                    "[]" +
                    "[40]" +
                    "[fill]" +
                    "[40,fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[47,fill]" +
                    "[fill]0" +
                    "[]"));

                //---- logo ----
                logo.setIcon(new ImageIcon(getClass().getResource("/static/images/Ethio ProjectHub.png")));
                loginForm.add(logo, "cell 0 0");

                //---- nameabel ----
                nameabel.setForeground(Color.red);
                nameabel.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                loginForm.add(nameabel, "cell 0 1");

                //---- nameField ----
                nameField.setToolTipText("email or username");
                nameField.setPreferredSize(new Dimension(100, 40));
                loginForm.add(nameField, "cell 0 2,height 40::40");

                //---- emailLabel ----
                emailLabel.setForeground(new Color(0xff0033));
                emailLabel.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                loginForm.add(emailLabel, "cell 0 4,align center bottom,grow 0 0,width 270::270,height 20::20");

                //---- emailField ----
                emailField.setToolTipText("email or username");
                emailField.setPreferredSize(new Dimension(100, 40));
                loginForm.add(emailField, "cell 0 5,alignx center,growx 0,width 270::270,height 40::40");

                //---- label3 ----
                label3.setForeground(new Color(0xff0033));
                label3.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                loginForm.add(label3, "cell 0 6");

                //---- pnum ----
                pnum.setToolTipText("email or username");
                pnum.setPreferredSize(new Dimension(100, 40));
                pnum.setMinimumSize(new Dimension(49, 40));
                loginForm.add(pnum, "cell 0 7,width 270::270,height 40::40");

                //---- label1 ----
                label1.setForeground(new Color(0xff0033));
                label1.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                loginForm.add(label1, "cell 0 8");

                //---- password ----
                passwordField.setToolTipText("password");
                passwordField.setSelectionColor(new Color(0xd2ccff));
                passwordField.setName("password");
                passwordField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                passwordField.setMinimumSize(new Dimension(150, 40));
                passwordField.setPreferredSize(new Dimension(100, 40));
                loginForm.add(passwordField, "cell 0 9,alignx center,growx 0,width 270::270,height 40::40");

                //---- loginBtn ----
                loginBtn.setText("Sign Up");
                loginBtn.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 16));
                loginBtn.setDefaultCapable(false);
                loginBtn.setFocusable(false);
                loginBtn.setForeground(new Color(0xf5f5f5));
                loginBtn.setBorderPainted(false);
                loginBtn.addActionListener(e -> {
                    try {
                        signup(e);
                    } catch (IOException | SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                });
                loginForm.add(loginBtn, "cell 0 10,alignx center,growx 0,width 120::120,height 40::40");

                //---- button2 ----
                button2.setText("Already have Account?? Log In");
                button2.setForeground(new Color(0x3366ff));
                button2.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
                button2.setBorder(new EmptyBorder(5, 5, 5, 5));
                button2.setHorizontalAlignment(SwingConstants.LEADING);
                button2.setBorderPainted(false);
                button2.setContentAreaFilled(false);
                button2.setMinimumSize(new Dimension(270, 40));
                button2.setPreferredSize(new Dimension(270, 40));
                button2.setMaximumSize(new Dimension(293, 40));
                button2.addActionListener(e -> login(e));
                loginForm.add(button2, "cell 0 11");
            }
            panel3.add(loginForm, "cell 0 0");
        }
        add(panel3, "cell 0 0,align center center,grow 0 0");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Tekletsadik A
    private JPanel panel3;
    private JPanel loginForm;
    private JLabel logo;
    private JLabel nameabel;
    private JFormattedTextField nameField;
    private JLabel emailLabel;
    private JFormattedTextField emailField;
    private JLabel label3;
    private JFormattedTextField pnum;
    private JLabel label1;
    private JPasswordField passwordField;
    private JButton loginBtn;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
