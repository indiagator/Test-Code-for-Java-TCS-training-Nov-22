package com.tcs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CredentialDAO
{

    public CredentialDAO()
    {
        dbConnection = new DbConnection();
    }

    private DbConnection dbConnection;
    //Credential credential;

    public String getPassword(String username) throws SQLException
    {

        String password=null;
        String query = "SELECT * FROM credential WHERE username='"+username+"'  "; // DATA MANIPULATION COMMAND
        Statement statement = null;
        ResultSet resultSet = null;

        statement = dbConnection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        if(resultSet.next())
        {
            password = resultSet.getString(2);
            return password;
        }
        else
        {
            return password;
        }

    }

    public void signup(String username, String passHash) throws SQLException
    {
        String query = "INSERT INTO credential(username, password) VALUES ('"+username+"','"+passHash+"')"; // DATA MANIPULATION COMMAND
        Statement statement = dbConnection.getDbconnection().createStatement();
        statement.execute(query);
    }

    // public void setCredential(Credential credential) {
    //   this.credential = credential;
    // }

    // static void save(Credential credential)
    // {

    // }



}
