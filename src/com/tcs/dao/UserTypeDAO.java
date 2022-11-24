package com.tcs.dao;

import com.tcs.side.UserType;
import java.sql.SQLException;
import java.sql.Statement;

public class UserTypeDAO
{
    private UserType userType;
    DbConnection connection;

    public UserTypeDAO()
    {
        connection = new DbConnection();
    }

    public void saveUserType(String username, Type type) throws SQLException
    {
        String query = "INSERT INTO usertype(username,type) VALUES ('"+username+"','"+type+"')";
        Statement statement = connection.getDbconnection().createStatement();
        statement.execute(query);
    }

}
