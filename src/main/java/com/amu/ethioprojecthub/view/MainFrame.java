/*
 * Created by JFormDesigner on Sat Feb 11 16:57:24 EAT 2023
 */

package com.amu.ethioprojecthub.view;

import com.amu.ethioprojecthub.view.auth.login.Login;
import com.amu.ethioprojecthub.view.auth.signup.Signup;
import com.amu.ethioprojecthub.view.home.Home;

import javax.swing.*;
import java.awt.*;
import java.util.prefs.Preferences;

/**
 * @author tekle
 */
public class MainFrame extends JFrame {
    private Login login;
    private Signup signup;
    private Home home;

    private CardLayout cardLayout;
    private Menu menu;

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Tekletsadik A

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/static/images/Ethio ProjectHub.png")).getImage());
        setTitle("Ethio ProjectHub");
        setFont(new Font("Montserrat", Font.PLAIN, 12));
        setMinimumSize(new Dimension(1000, 700));
        setVisible(true);
        setPreferredSize(new Dimension(1000, 700));
        var contentPane = getContentPane();
        cardLayout = new CardLayout();
        login = new Login(this);
        signup = new Signup(this);
        contentPane.setLayout(cardLayout);
        contentPane.add(login,"login");
        contentPane.add(signup,"signup");
        cardLayout.show(contentPane,"login");

        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    public void showLogin() {
        cardLayout.show(getContentPane(),"login");
    }
    public void showSignup() {
        cardLayout.show(getContentPane(),"signup");
    }

    public void showHome(Home home) {
        var contentPane = getContentPane();
        this.home = home;
        contentPane.add(this.home,"home");
        cardLayout.show(getContentPane(),"home");
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Tekletsadik A
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
