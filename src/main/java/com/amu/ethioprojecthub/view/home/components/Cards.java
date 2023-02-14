package com.amu.ethioprojecthub.view.home.components;

import com.amu.ethioprojecthub.controller.ProjectController;
import com.amu.ethioprojecthub.model.Project;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class Cards extends JPanel {
    int numCards;
    private List<Project> projectList;
    private ProjectController projectController;

    public Cards() throws SQLException {
        projectController = new ProjectController();
        projectList = projectController.getAllProjects();
    }
    public Cards innit() throws SQLException {

        Cards cards = new Cards();
        this.setBackground(new Color(0x282a3a));
        this.setAutoscrolls(true);
        this.setLayout(new GridBagLayout());
        ((GridBagLayout)this.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
        ((GridBagLayout)this.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
        ((GridBagLayout)this.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)this.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

        //======== this3 ========
        //For Loop and Auto Scrollable
        numCards = projectController.getAllProjects().size();
        int numRows = (int) Math.ceil(numCards / 4.0);
        this.setLayout(new GridLayout(numRows, 3, 10, 10)); // Set the layout to a grid with 4 columns and 10 pixels of spacing between cards

        for (int i = 0; i < numCards; i++) {
            this.add(new ProjectCard(projectList.get(i)));
        }
        return cards;
    }

}
