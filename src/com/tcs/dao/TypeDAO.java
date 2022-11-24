package com.tcs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TypeDAO
{
    DbConnection connection;

    public TypeDAO()
    {
        connection = new DbConnection();
    }

    public Type fetchUserType(String username) throws SQLException
    {
        Type type =null;

        String query = "SELECT * FROM usertype WHERE username='"+username+"'  "; // DATA MANIPULATION COMMAND
        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        if(resultSet.next())
        {
            String typeString =  resultSet.getString(2);

            switch (typeString)
            {
                case "BUYER"  : type  = Type.BUYER;break;
                case "SELLER" : type  = Type.SELLER;break;
                case "ADMIN"  : type  = Type.ADMIN;break;
            }

            return type;
        }
        else
        {
            return type;
        }
    }
}
