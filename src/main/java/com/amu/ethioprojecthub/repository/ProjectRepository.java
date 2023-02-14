package com.amu.ethioprojecthub.repository;

import com.amu.ethioprojecthub.database.DatabaseManager;
import com.amu.ethioprojecthub.model.Project;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ProjectRepository {
    private DatabaseManager databaseManager;

    public ProjectRepository() throws SQLException {
        databaseManager = new DatabaseManager();
    }

    public Project getProjectById(String id) {
        Project project = null;
        try (Connection connection = databaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM projects WHERE id = ?")) {
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                project = new Project(resultSet.getString("id"),resultSet.getString("projectName"),resultSet.getString("description"), resultSet.getString("ownerId") ,resultSet.getString("mediaFile"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return project;
    }


    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();
        try (Connection connection = databaseManager.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM projects");
            while (resultSet.next()) {
                Project project = new Project(resultSet.getString("id"),resultSet.getString("projectName"),resultSet.getString("description"), resultSet.getString("ownerId") ,resultSet.getString("mediaFile"));
                projects.add(project);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projects;
    }

    public Project saveproject(Project project) {
        try (Connection connection = databaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO projects (id, projectName, description,ownerId,mediaFile) VALUES (?, ?, ?, ?, ?)")) {
            statement.setString(1, UUID.randomUUID().toString());
            statement.setString(2, project.getProjectName());
            statement.setString(3, project.getDescription());
            statement.setString(4, project.getOwnerId());
            statement.setString(5, project.getMediaFile());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return project;
    }

    public Project updateProject(String id,Project project) {
        try (Connection connection = databaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement("UPDATE projects SET projectName = ?, description = ?,mediaFile = ?, ownerId = ? WHERE id = ?")) {
            statement.setString(1, project.getProjectName());
            statement.setString(2, project.getDescription());
            statement.setString(3, project.getMediaFile());
            statement.setString(4, project.getOwnerId());
            statement.setString(5, UUID.randomUUID().toString());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return project;
    }

    public void deleteProject(String id) {
        try (Connection connection = databaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement("DELETE FROM projects WHERE id = ?")) {
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
