/*
 * Created by JFormDesigner on Wed Mar 01 16:22:33 EAT 2023
 */

package com.amu.ethioprojecthub.view.home.components;

import javax.swing.*;

import com.amu.ethioprojecthub.controller.AuthController;
import com.amu.ethioprojecthub.controller.ProjectController;
import com.amu.ethioprojecthub.model.Project;
import com.amu.ethioprojecthub.model.User;
import com.amu.ethioprojecthub.view.home.Home;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import net.miginfocom.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author tekle
 */
public class ProjectForm extends JPanel {
    private Home home;
    ProjectController projectController;

    private Project project = new Project();

    public ProjectForm(Home home) throws SQLException {
        this.home = home;
        projectController = new ProjectController();
        initComponents();
    }

    private void addProject(ActionEvent e) throws IOException, SQLException {
        String name  = nameField.getText();
        String org = orgField.getText();
        String gitLink = github.getText();
        String desc = description.getText();
        project.setProjectName(name);
        project.setOwnerId(org);
        project.setMediaFile(gitLink);
        project.setDescription(desc);
        projectController.createProject(project);

    }

    private void initComponents( ) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Mahlet Yifru
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        panel3 = new JPanel();
        projectForm = new JPanel();
        logo = new JLabel();
        nameabel = compFactory.createLabel("project title");
        nameField = new JFormattedTextField();
        orgLabel = compFactory.createLabel("Organization Name");
        orgField = new JFormattedTextField();
        label1 = compFactory.createLabel("github");
        github = new JFormattedTextField();

        label3 = compFactory.createLabel("description");
        description = new JTextArea();
        addProject = new JButton();
        cancelProject = new JButton();
        button2 = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(534, 734));

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

            //======== projectForm ========
            {
                projectForm.setLayout(new MigLayout(
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

                //---- nameabel ----
                nameabel.setForeground(Color.red);
                nameabel.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                projectForm.add(nameabel, "cell 0 1");

                //---- nameField ----
                nameField.setToolTipText("email or username");
                nameField.setPreferredSize(new Dimension(100, 40));
                projectForm.add(nameField, "cell 0 2,height 40::40");

                //---- orgLabel ----
                orgLabel.setForeground(new Color(0xff0033));
                orgLabel.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                projectForm.add(orgLabel, "cell 0 4,align center bottom,grow 0 0,width 270::270,height 20::20");

                //---- orgField ----
                orgField.setToolTipText("email or username");
                orgField.setPreferredSize(new Dimension(100, 40));
                projectForm.add(orgField, "cell 0 5,alignx center,growx 0,width 270::270,height 40::40");


                //---- label1 ----
                label1.setForeground(new Color(0xff0033));
                label1.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                projectForm.add(label1, "cell 0 7");
//---- label3 ----

                //---- github ----
                github.setToolTipText("email or username");
                github.setPreferredSize(new Dimension(100, 40));
                github.setMinimumSize(new Dimension(49, 40));
                projectForm.add(github, "cell 0 8,width 270::270,height 40::40");


                label3.setForeground(new Color(0xff0033));
                label3.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 14));
                projectForm.add(label3, "cell 0 10");


                //---- github ----
                description.setToolTipText("email or username");
                description.setPreferredSize(new Dimension(100, 80));
                description.setMinimumSize(new Dimension(49, 40));
                projectForm.add(description, "cell 0 11,width 270::270,height 70::70");

                //---- to do ----


                //---- addProject ----
                addProject.setText("Add Project");
                addProject.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 16));
                addProject.setDefaultCapable(false);
                addProject.setFocusable(false);
                addProject.setForeground(new Color(0xf5f5f5));
                addProject.setBorderPainted(false);
                addProject.addActionListener(e -> {
                    try {
                        addProject(e);
                        home.showContent();

                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                });
                projectForm.add(addProject, "cell 0 15,alignx center,growx 0,width 120::120,height 40::40");

                //---- addProject ----
                cancelProject.setText("Cancel");
                cancelProject.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 16));
                cancelProject.setDefaultCapable(false);
                cancelProject.setFocusable(false);
                cancelProject.setForeground(new Color(0xf5f5f5));
                cancelProject.setBorderPainted(false);
                cancelProject.addActionListener(e -> {
                    try {
                        home.showContent();
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                });
                projectForm.add(cancelProject, "cell 0 15,alignx center,growx 0,width 120::120,height 40::40");

            }
            panel3.add(projectForm, "cell 0 0");
        }
        add(panel3, "cell 0 0,align center center,grow 0 0");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    private JPanel panel3;
    private JPanel projectForm;
    private JLabel logo;
    private JLabel nameabel;
    private JFormattedTextField nameField;
    private JLabel orgLabel;
    private JTextArea description;
    private JFormattedTextField orgField;
    private JLabel label3;
    private JFormattedTextField github;
    private JLabel label1;

    private JButton addProject;
    private JButton cancelProject;
    private JButton button2;

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Tekletsadik A
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
