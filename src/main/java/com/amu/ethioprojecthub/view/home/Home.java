/*
 * Created by JFormDesigner on Sun Feb 12 12:27:02 EAT 2023
 */

package com.amu.ethioprojecthub.view.home;

import com.amu.ethioprojecthub.model.User;
import com.amu.ethioprojecthub.view.MainFrame;
import com.amu.ethioprojecthub.view.home.components.Cards;
import com.amu.ethioprojecthub.view.home.components.ProjectForm;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.SQLException;

/**
 * @author tekletsadik
 */
public class Home extends JPanel {
    private MainFrame mainFrame;
    private Cards cards;

    public Home(User user,MainFrame mainFrame) throws SQLException {
        this.mainFrame = mainFrame;
        initComponents(user);
    }

    private void jPanel2MouseDragged(MouseEvent e) {
        // TODO add your code here
    }

    private void jPanel2MousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void logout(MouseEvent e) {
        mainFrame.showLogin();
    }

    private void initComponents(User user) throws SQLException {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Tekletsadik A
        panel1 = new JPanel();
        jPanel2 = new JPanel();
        jTextField1 = new JTextField();
        jLabel7 = new JLabel();
        panel3 = new JPanel();
        jPanel8 = new JPanel();
        jLabel16 = new JLabel();
        jPanel4 = new JPanel();
        jLabel12 = new JLabel();
        jPanel7 = new JPanel();
        contentPanel = new JPanel();
        contentPanelLayout = new CardLayout();
        jLabel15 = new JLabel();
        jPanel5 = new JPanel();
        jLabel14 = new JLabel();
        jPanel9 = new JPanel();
        jLabel18 = new JLabel();
        jPanel6 = new JPanel();
        jLabel17 = new JLabel();
        btn_4 = new JPanel();
        ind_4 = new JPanel();
        jLabel13 = new JLabel();
        panel2 = new JPanel();
        cards = new Cards();
        this2 = new JPanel();
        this3 = new JPanel();
        contentPanel.setLayout(contentPanelLayout);

        //======== this ========
        setPreferredSize(new Dimension(1000, 620));
        setMinimumSize(new Dimension(1000, 620));
        setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x172333));
            panel1.setPreferredSize(new Dimension(950, 600));
            panel1.setMinimumSize(new Dimension(950, 600));
            panel1.setLayout(new MigLayout(
                    "fill,insets 0,hidemode 3,aligny top",
                    // columns
                    "[260,fill]" +
                            "[138,grow,fill]" +
                            "[132,fill]" +
                            "[205,fill]" +
                            "[433,grow,fill]",
                    // rows
                    "[40!,fill]0" +
                            "[40]" +
                            "[57]" +
                            "[]" +
                            "[]0" +
                            "[344]0"));

            //======== jPanel2 ========
            {
                jPanel2.setBackground(new Color(0x0f3460));
                jPanel2.setPreferredSize(new Dimension(396, 50));
                jPanel2.setMinimumSize(new Dimension(396, 50));
                jPanel2.addMouseMotionListener(new MouseMotionAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        jPanel2MouseDragged(e);
                    }
                });
                jPanel2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        jPanel2MousePressed(e);
                    }
                });

                //---- jTextField1 ----
                jTextField1.setBackground(new Color(0x172333));
                jTextField1.setForeground(Color.white);
                jTextField1.setBorder(null);
                jTextField1.setCaretColor(Color.white);
                jTextField1.setPreferredSize(new Dimension(2, 20));

                //---- jLabel7 ----
                jLabel7.setIcon(new ImageIcon(getClass().getResource("/static/images/icons8-search-25.png")));

                GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addGap(34, 34, 34))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup()
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel2Layout.createParallelGroup()
                                                .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                                .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                                        .addContainerGap())
                );
            }
            panel1.add(jPanel2, "cell 0 0 5 1,aligny center,growy 0,height 50::50,gapy null 5");

            //======== panel3 ========
            {
                panel3.setBackground(new Color(0x282a3a));
                panel3.setLayout(new MigLayout(
                        "insets 0,hidemode 3,alignx leading,gap 5 5",
                        // columns
                        "[fill]",
                        // rows
                        "rel[180]" +
                                "[]" +
                                "[fill]" +
                                "[fill]" +
                                "[]" +
                                "[]0" +
                                "[0]0" +
                                "[0,grow]0" +
                                "[111,grow]"));

                //======== jPanel8 ========
                {
                    jPanel8.setBackground(new Color(0xD30F3460, true));

                    //---- jLabel16 ----
                    jLabel16.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
                    jLabel16.setForeground(Color.black);

                    GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
                    jPanel8.setLayout(jPanel8Layout);
                    jPanel8Layout.setHorizontalGroup(
                            jPanel8Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                            .addContainerGap(70, Short.MAX_VALUE)
                                            .addComponent(jLabel16)
                                            .addGap(66, 66, 66))
                    );
                    jPanel8Layout.setVerticalGroup(
                            jPanel8Layout.createParallelGroup()
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel16)
                                            .addContainerGap(24, Short.MAX_VALUE))
                    );
                }
                panel3.add(jPanel8, "cell 0 0,growy");

                //======== jPanel4 ========
                {
                    jPanel4.setBackground(new Color(0x474e68));

                    //---- jLabel12 ----
                    jLabel12.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
                    jLabel12.setForeground(Color.black);
                    jLabel12.setText(user.getUsername());

                    GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
                    jPanel4.setLayout(jPanel4Layout);
                    jPanel4Layout.setHorizontalGroup(
                            jPanel4Layout.createParallelGroup()
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    jPanel4Layout.setVerticalGroup(
                            jPanel4Layout.createParallelGroup()
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }
                panel3.add(jPanel4, "cell 0 1");

                //======== jPanel7 ========
                {
                    jPanel7.setBackground(new Color(0x474e68));

                    //---- jLabel15 ----
                    jLabel15.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
                    jLabel15.setForeground(Color.black);
                    jLabel15.setText(user.getPhoneNumber());

                    GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
                    jPanel7.setLayout(jPanel7Layout);
                    jPanel7Layout.setHorizontalGroup(
                            jPanel7Layout.createParallelGroup()
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    jPanel7Layout.setVerticalGroup(
                            jPanel7Layout.createParallelGroup()
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }
                panel3.add(jPanel7, "cell 0 2");

                //======== jPanel5 ========
                {
                    jPanel5.setBackground(new Color(0x474e68));

                    //---- jLabel14 ----
                    jLabel14.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
                    jLabel14.setForeground(Color.black);
                    jLabel14.setText(user.getEmail());

                    GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
                    jPanel5.setLayout(jPanel5Layout);
                    jPanel5Layout.setHorizontalGroup(
                            jPanel5Layout.createParallelGroup()
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel14)
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    jPanel5Layout.setVerticalGroup(
                            jPanel5Layout.createParallelGroup()
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }
                panel3.add(jPanel5, "cell 0 3");

                //======== jPanel9 ========
                {
                    jPanel9.setBackground(new Color(0x474e68));

                    //---- jLabel18 ----
                    jLabel18.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
                    jLabel18.setForeground(Color.black);
                    jLabel18.setText("Add Projects");

                    GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
                    jPanel9.setLayout(jPanel9Layout);
                    jPanel9Layout.setHorizontalGroup(
                            jPanel9Layout.createParallelGroup()
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    jPanel9Layout.setVerticalGroup(
                            jPanel9Layout.createParallelGroup()
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    jPanel9.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            contentPanelLayout.show(contentPanel,"projectForm");
                        }
                    });
                }
                panel3.add(jPanel9, "cell 0 4");

                //======== jPanel6 ========
                //======== btn_4 ========
                {
                    btn_4.setBackground(new Color(0xff0033));
                    btn_4.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
                    btn_4.setMinimumSize(new Dimension(80, 51));
                    btn_4.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            logout(e);
                        }
                    });

                    //======== ind_4 ========
                    {
                        ind_4.setOpaque(false);
                        ind_4.setPreferredSize(new Dimension(3, 43));

                        GroupLayout ind_4Layout = new GroupLayout(ind_4);
                        ind_4.setLayout(ind_4Layout);
                        ind_4Layout.setHorizontalGroup(
                                ind_4Layout.createParallelGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                        );
                        ind_4Layout.setVerticalGroup(
                                ind_4Layout.createParallelGroup()
                                        .addGap(0, 43, Short.MAX_VALUE)
                        );
                    }

                    //---- jLabel13 ----
                    jLabel13.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 13));
                    jLabel13.setForeground(Color.black);
                    jLabel13.setText("Logout");

                    GroupLayout btn_4Layout = new GroupLayout(btn_4);
                    btn_4.setLayout(btn_4Layout);
                    btn_4Layout.setHorizontalGroup(
                            btn_4Layout.createParallelGroup()
                                    .addGroup(btn_4Layout.createSequentialGroup()
                                            .addComponent(ind_4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(jLabel13)
                                            .addGap(0, 203, Short.MAX_VALUE))
                    );
                    btn_4Layout.setVerticalGroup(
                            btn_4Layout.createParallelGroup()
                                    .addGroup(btn_4Layout.createSequentialGroup()
                                            .addComponent(ind_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 8, Short.MAX_VALUE))
                                    .addGroup(btn_4Layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addContainerGap())
                    );
                }
                panel3.add(btn_4, "cell 0 7 1 2,aligny bottom,growy 0");
            }
            panel1.add(panel3, "cell 0 1 1 5,alignx left,grow 0 100");

            //======== panel2 ========
            {
                panel2.setBackground(new Color(0x282a3a));
                panel2.setAutoscrolls(true);
                panel1.setAutoscrolls(true);

                //======== cards ========
                {
                    new Cards();
                }

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(cards, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                );
                panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                                .addComponent(cards, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }

            scrollPane = new JScrollPane(panel2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrollPane.setBorder(null);


            scrollPane.add(cards.innit());

            contentPanel.add(scrollPane,"Contents");
            contentPanel.add(new ProjectForm(this),"projectForm");
            contentPanelLayout.show(contentPanel,"Contents");
            panel1.add(contentPanel, "cell 1 1 4 5,grow");
        }
        add(panel1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
    public void showContent() {
        contentPanelLayout.show(contentPanel,"Contents");
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Tekletsadik A
    private JPanel panel1;
    private JPanel contentPanel;
    private JScrollPane scrollPane;
    private JPanel jPanel2;
    private JTextField jTextField1;
    private JLabel jLabel7;
    private JPanel panel3;
    private JPanel jPanel8;
    private JLabel jLabel16;
    private JPanel jPanel4;
    private JLabel jLabel12;
    private JPanel jPanel7;
    private JLabel jLabel15;
    private JPanel jPanel5;
    private JLabel jLabel14;
    private JPanel jPanel9;
    private JLabel jLabel18;
    private JPanel jPanel6;
    private JLabel jLabel17;
    private JPanel btn_4;
    private JPanel ind_4;
    private JLabel jLabel13;
    private JPanel panel2;
    private JPanel this2;
    private JPanel this3;
    private CardLayout contentPanelLayout;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
