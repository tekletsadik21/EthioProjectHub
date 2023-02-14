package com.amu.ethioprojecthub.service;

import com.amu.ethioprojecthub.model.Project;
import com.amu.ethioprojecthub.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    public ProjectService() throws SQLException {
        this.projectRepository = new ProjectRepository();
    }

    public Project createProject(Project project) {
        return projectRepository.saveproject(project);
    }

    public Project getProjectByName(String id) {
        return projectRepository.getProjectById(id);
    }

    public Project updateProject(String id, Project project) {
        Project existingProject = getProjectByName(id);
        if (existingProject == null) {
            return null;
        }
        existingProject.setId(project.getId());
        existingProject.setOwnerId(project.getOwnerId());
        existingProject.setProjectName(project.getProjectName());
        existingProject.setDescription(project.getDescription());
        existingProject.setPostId(project.getPostId());
        existingProject.setMediaFile(project.getMediaFile());

        return projectRepository.updateProject(id,existingProject);
    }

    public void deleteProject(String id) {
        projectRepository.deleteProject(id);
    }

    public List<Project> getAllProjects() {

        return projectRepository.getAllProjects();
    }
}
