package com.amu.ethioprojecthub.controller;

import com.amu.ethioprojecthub.model.User;

import java.sql.SQLException;

public interface LoginListener {
    void onLoginSuccess(User user) throws SQLException;
    void onLoginFailure(String errorMessage);
}
