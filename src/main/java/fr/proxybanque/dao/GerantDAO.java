package fr.proxybanque.dao;

import fr.proxybanque.model.Gerant;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author INTI-0237
 */
@Repository
public class GerantDAO {



	public boolean isExistGerant(String login,String password) throws SQLException {

		Connection con = null;
        PreparedStatement ps = null;
        try {
        	 Class.forName("com.mysql.jdbc.Driver");
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_proxybanque",
                     "root", "root");
            ps = (PreparedStatement) con.prepareStatement(
                    "select login, password from gerants where login= ? and password= ? ");
            ps.setString(1, login);
            ps.setString(2, password);
  
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // found
            {
                System.out.println(rs.getString("login"));
                return true;
            }
            else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error in login() -->" + ex.getMessage());
            return false;
        } finally {
           con.close();
        }
    		
	}		
}
