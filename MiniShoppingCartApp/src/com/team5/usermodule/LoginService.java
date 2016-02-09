package com.team5.usermodule;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 

public class LoginService {
 
    public boolean authenticateUser(String userId, String password) {
        User user = getUserByUserId(userId);         
        if(user!=null && user.getEmail().equals(userId) && user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
 
    public User getUserByUserId(String userId) {
        Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        Transaction tx = null;
        User user = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from User where email='"+userId+"'");
            user = (User)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user;
    }
     
  
}