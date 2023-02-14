/*
 * Created by JFormDesigner on Tue Feb 14 12:07:37 EAT 2023
 */

package com.amu.ethioprojecthub.view.home.components;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;
import net.miginfocom.swing.*;

/**
 * @author tekle
 */
public class ProjectCard extends JPanel {
    public ProjectCard() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Tekletsadik A
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        logo = compFactory.createLabel("");

        //======== this ========
        setMinimumSize(new Dimension(250, 300));
        setPreferredSize(new Dimension(250, 300));
        setMaximumSize(new Dimension(250, 300));
        setBackground(new Color(0x2c343a));

        //---- logo ----
        logo.setBackground(new Color(0x2c343a));
        logo.setIcon(new ImageIcon(getClass().getResource("/static/images/img-eth.png")));
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        logo.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0x3651cf)));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(logo, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(logo, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 241, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Tekletsadik A
    private JLabel logo;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
