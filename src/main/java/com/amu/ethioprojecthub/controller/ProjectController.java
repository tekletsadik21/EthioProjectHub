package com.amu.ethioprojecthub.controller;

import com.amu.ethioprojecthub.model.Project;
import com.amu.ethioprojecthub.model.User;
import com.amu.ethioprojecthub.service.AppConfig;
import com.amu.ethioprojecthub.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    private AppConfig appConfig;

    @Autowired
    public ProjectController() throws SQLException {
        appConfig = new AppConfig();
        this.projectService = new ProjectService();
    }


    public Project createProject(Project project) {
        return projectService.createProject(project);
    }


    public Project getProjectByName(@PathVariable("id") String name) {
        return projectService.getProjectByName(name);
    }


    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }


    public Project updateProject(@PathVariable("id") String id, @RequestBody Project project) {
        return projectService.updateProject(id, project);
    }

    public void deleteProject(@PathVariable("id") String id) {
        projectService.deleteProject(id);
    }
}
