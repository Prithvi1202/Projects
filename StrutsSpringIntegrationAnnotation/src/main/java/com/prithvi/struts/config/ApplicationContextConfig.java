package com.prithvi.struts.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prithvi.struts.UserDAO;
 
@Configuration
@ComponentScan("com.prithvi.struts")
public class ApplicationContextConfig {
     
    @Bean(name = "userDAO")
    public UserDAO getUserDAO() {
        return new UserDAO();
    }  
}