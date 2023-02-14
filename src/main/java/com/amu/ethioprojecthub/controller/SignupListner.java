package com.amu.ethioprojecthub.controller;

import com.amu.ethioprojecthub.model.User;

import java.sql.SQLException;

public interface SignupListner {
    void onSignupSuccess(User user) throws SQLException;
    void onSignupFailure(String errorMessage);
}
