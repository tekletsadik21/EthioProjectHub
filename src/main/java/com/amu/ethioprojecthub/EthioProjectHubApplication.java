package com.amu.ethioprojecthub;

import com.amu.ethioprojecthub.database.DatabaseManager;
import com.amu.ethioprojecthub.view.MainFrame;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan
public class EthioProjectHubApplication {
    EthioProjectHubApplication(){
        EventQueue.invokeLater(() ->
        {
            MainFrame frame = null;
            try {
                frame = new MainFrame();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
	public static void main(String[] args) {
        try {
            DatabaseManager.createTables();
            FlatLaf.registerCustomDefaultsSource( "com.amu.ethioprojecthub" );
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        SpringApplication.run(EthioProjectHubApplication.class, args);
	}

}
