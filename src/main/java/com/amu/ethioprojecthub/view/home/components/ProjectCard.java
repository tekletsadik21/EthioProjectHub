/*
 * Created by JFormDesigner on Tue Feb 14 12:07:37 EAT 2023
 */

package com.amu.ethioprojecthub.view.home.components;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.tree.DefaultMutableTreeNode;

import com.amu.ethioprojecthub.controller.ProjectController;
import com.amu.ethioprojecthub.model.Project;
import com.jgoodies.forms.factories.*;
import net.miginfocom.swing.*;

/**
 * @author leul abera
 */
public class ProjectCard extends JPanel {
    private Project project;
    private List<Project> projectList;
    private ProjectController projectController;


    public ProjectCard(Project project) {
        this.project = project;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Tekletsadik A
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        logo = compFactory.createLabel("");
        title1 = compFactory.createTitle(project.getProjectName());
        label1 = compFactory.createLabel(project.getOwnerId());
        label4 = compFactory.createLabel("Dev : ");
        label5 = compFactory.createLabel("Desc : ");
        label2 = compFactory.createLabel(project.getDescription());
        label6 = compFactory.createLabel("Github:");
        label7 = compFactory.createLabel(project.getMediaFile());

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

        //---- label1 ----
        label1.setForeground(new Color(0x99ff33));

        //---- label5 ----
        label5.setForeground(new Color(0xff3333));

        //---- label2 ----
        label2.setForeground(new Color(0xff3333));

        //---- label6 ----
        label6.setForeground(new Color(0x9999ff));

        //---- label7 ----
        label7.setForeground(new Color(0x6666ff));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(logo, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(title1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(logo, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(title1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Tekletsadik A
    private JLabel logo;
    private JLabel title1;
    private JLabel label1;
    private JLabel label4;
    private JLabel label5;
    private JLabel label2;
    private JLabel label6;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
