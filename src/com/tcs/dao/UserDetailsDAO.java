package com.tcs.dao;

import com.tcs.side.UserDetails;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDetailsDAO
{
    UserDetails userDetails;

    DbConnection connection;

    public UserDetailsDAO()
    {
        connection = new DbConnection();
    }

    public void saveUserDetails(String username, String fname,String lname, String email, String phone) throws SQLException
    {
        String query = "INSERT INTO userdetails(username,fname,lname,email,phone) VALUES ('"+username+"','"+fname+"','"+lname+"','"+email+"','"+phone+"')";
        Statement statement = connection.getDbconnection().createStatement();
        statement.execute(query);
    }

    public UserDetails fetchUserDetails(String username) throws SQLException
    {
        UserDetails userDetails = new UserDetails();
        String query = "SELECT * FROM userdetails WHERE username='"+username+"'  "; // DATA MANIPULATION COMMAND

        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        if(resultSet.next())
        {
            String fname = resultSet.getString(2);
            String lname = resultSet.getString(5);
            String email = resultSet.getString(3);
            String phone = resultSet.getString(4);

            userDetails.setUsername(username);
            userDetails.setFname(fname);
            userDetails.setLname(lname);
            userDetails.setEmail(email);
            userDetails.setPhone(phone);

            return userDetails;
        }
        else
        {
            return null;
        }

    }

}

