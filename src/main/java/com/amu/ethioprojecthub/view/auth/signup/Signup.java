/*
 * Created by JFormDesigner on Fri Feb 10 23:47:11 EAT 2023
 */

package com.amu.ethioprojecthub.view.auth.signup;

import com.amu.ethioprojecthub.view.MainFrame;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author tekle
 */
public class Signup extends JPanel {
    private MainFrame mainFrame;
    public Signup(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    private void signup(ActionEvent e) {
        
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
        label2 = compFactory.createLabel("username or email");
        usename = new JFormattedTextField();
        label3 = compFactory.createLabel("phone");
        usename2 = new JFormattedTextField();
        label1 = compFactory.createLabel("Password");
        password = new JPasswordField();
        loginBtn = new JButton();
        button2 = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(534, 734));
        setMinimumSize(new Dimension(500, 700));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
        .EmptyBorder(0,0,0,0), "",javax.swing.border.TitledBorder.CENTER,javax
        .swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,
        12),java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans
        .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.
        getPropertyName()))throw new RuntimeException();}});
        setLayout(new MigLayout(
            "hidemode 3,align center center",
            // columns
            "[631,fill]",
            // rows
            "[628]"));

        //======== panel3 ========
        {
            panel3.setForeground(new Color(0xf5f5f5));
            panel3.setLayout(new MigLayout(
                "fill,insets 10,hidemode 3,align center center",
                // columns
                "[124,fill]",
                // rows
                "[0]" +
                "[]"));

            //======== loginForm ========
            {
                loginForm.setLayout(new MigLayout(
                    "fill,insets 10,hidemode 3,gap 0 5",
                    // columns
                    "[fill]",
                    // rows
                    "[149,grow]" +
                    "[27,grow]0" +
                    "[28]" +
                    "[28]0" +
                    "[28]0" +
                    "[10]0" +
                    "[0]0" +
                    "[13]0" +
                    "[25,grow]" +
                    "[21,grow]0" +
                    "[]"));

                //---- logo ----
                logo.setIcon(new ImageIcon(getClass().getResource("/static/images/Ethio ProjectHub.png")));
                loginForm.add(logo, "pad 2 30 2 2,cell 0 0,align center top,grow 0 0,width 300:300,height 200:200");

                //---- label2 ----
                label2.setForeground(Color.red);
                label2.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                loginForm.add(label2, "cell 0 1,align center bottom,grow 0 0,width 270::270,height 20::20");

                //---- usename ----
                usename.setToolTipText("email or username");
                usename.setPreferredSize(new Dimension(100, 40));
                loginForm.add(usename, "cell 0 2,alignx center,growx 0,width 270::270,height 40::40");

                //---- label3 ----
                label3.setForeground(new Color(0xff0033));
                label3.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                loginForm.add(label3, "cell 0 3,align center bottom,grow 0 0,width 270::270,height 20::20");

                //---- usename2 ----
                usename2.setToolTipText("email or username");
                usename2.setPreferredSize(new Dimension(100, 40));
                loginForm.add(usename2, "cell 0 4,alignx center,growx 0,width 270::270,height 40::40");

                //---- label1 ----
                label1.setForeground(new Color(0xff0033));
                label1.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                loginForm.add(label1, "cell 0 7,align center bottom,grow 0 0,width 270::270,height 20::20");

                //---- password ----
                password.setToolTipText("password");
                password.setSelectionColor(new Color(0xd2ccff));
                password.setName("password");
                password.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                password.setMinimumSize(new Dimension(150, 40));
                password.setPreferredSize(new Dimension(100, 40));
                loginForm.add(password, "cell 0 8,alignx center,growx 0,width 270::270,height 40::40");

                //---- loginBtn ----
                loginBtn.setText("Sign Up");
                loginBtn.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 16));
                loginBtn.setDefaultCapable(false);
                loginBtn.setFocusable(false);
                loginBtn.setForeground(new Color(0xf5f5f5));
                loginBtn.setBorderPainted(false);
                loginBtn.addActionListener(e -> signup(e));
                loginForm.add(loginBtn, "cell 0 9,alignx center,growx 0,width 120::120,height 40::40");

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
                loginForm.add(button2, "cell 0 10,align center center,grow 0 0,width 270::270,height 40::40");
            }
            panel3.add(loginForm, "cell 0 0 1 2,align center center,grow 0 0");
        }
        add(panel3, "cell 0 0,align center center,grow 0 0");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Tekletsadik A
    private JPanel panel3;
    private JPanel loginForm;
    private JLabel logo;
    private JLabel label2;
    private JFormattedTextField usename;
    private JLabel label3;
    private JFormattedTextField usename2;
    private JLabel label1;
    private JPasswordField password;
    private JButton loginBtn;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
