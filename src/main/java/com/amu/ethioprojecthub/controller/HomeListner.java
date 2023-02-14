package com.amu.ethioprojecthub.controller;

import com.amu.ethioprojecthub.model.Project;
import com.amu.ethioprojecthub.model.User;

import java.sql.SQLException;

public interface HomeListner {
    void onHomeChange(Project project) throws SQLException;
}
