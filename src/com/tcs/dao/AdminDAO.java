package com.tcs.dao;

import com.tcs.side.Seller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminDAO
{
    public int getOfferCount() throws SQLException
    {
        int offerCount = 0;

        DbConnection connection = new DbConnection();

        String query = "SELECT count(offerid) FROM productoffers"; // DATA MANIPULATION COMMAND
        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        resultSet.next();
        offerCount = resultSet.getInt(1);

        connection.getDbconnection().close();
        return offerCount;
    }

    public int getOrderCount() throws SQLException
    {
        int orderCount = 0;

        DbConnection connection = new DbConnection();

        String query = "SELECT count(orderid) FROM orders"; // DATA MANIPULATION COMMAND
        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        resultSet.next();
        orderCount = resultSet.getInt(1);

        connection.getDbconnection().close();

        return orderCount;
    }

     public Map<String,Integer> getOfferCountSellerwise() throws SQLException
     {
         Map<String,Integer> countMap = new HashMap<>();

         List<String> sellerList = new ArrayList<>();

         DbConnection connection = new DbConnection();

         String query = "SELECT username FROM usertype WHERE type='SELLER'"; // DATA MANIPULATION COMMAND
         Statement statement = null;
         ResultSet resultSet = null;

         statement = connection.getDbconnection().createStatement();
         resultSet = statement.executeQuery(query);

        while (resultSet.next())
        {
            sellerList.add(resultSet.getString("username"));
        }

         for ( String username : sellerList )
         {
             String inQuery = "SELECT count(offerid) FROM productoffers WHERE username='"+username+"'"; // DATA MANIPULATION COMMAND
             Statement inStatement = null;
             ResultSet inResultSet = null;

             inStatement = connection.getDbconnection().createStatement();
             inResultSet = inStatement.executeQuery(inQuery);

             inResultSet.next();
             countMap.put(username,inResultSet.getInt(1));
         }

         connection.getDbconnection().close();

         return countMap;
     }

     public Map<String,Integer> getOrderCountBuyerwise() throws SQLException
     {
         Map<String,Integer> countMap = new HashMap<>();
         List<String> buyerList = new ArrayList<>();

         DbConnection connection = new DbConnection();

         String query = "SELECT username FROM usertype WHERE type='BUYER'"; // DATA MANIPULATION COMMAND
         Statement statement = null;
         ResultSet resultSet = null;
         statement = connection.getDbconnection().createStatement();
         resultSet = statement.executeQuery(query);

         while (resultSet.next())
         {
             buyerList.add(resultSet.getString("username"));
         }

         for ( String username : buyerList )
         {
             String inQuery = "SELECT count(orderid) FROM orders WHERE username='"+username+"'"; // DATA MANIPULATION COMMAND
             Statement inStatement = null;
             ResultSet inResultSet = null;

             inStatement = connection.getDbconnection().createStatement();
             inResultSet = inStatement.executeQuery(inQuery);

             inResultSet.next();
             countMap.put(username,inResultSet.getInt(1));
         }


         connection.getDbconnection().close();
         return countMap;
     }

    public Map<String,Integer> getOrderCountBuyerwiseConcise() throws SQLException
    {
        Map<String,Integer> countMap = new HashMap<>();

        DbConnection connection = new DbConnection();

        String query = "SELECT count(orderid) || ',' || fname || ' ' || lname FROM orders NATURAL JOIN userdetails GROUP BY username,fname,lname"; // DATA MANIPULATION COMMAND
        Statement statement = null;
        ResultSet resultSet = null;
        statement = connection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        while (resultSet.next())
        {
            String resultstring = resultSet.getString(1);
            String[] resultdata = resultstring.split(",");
            countMap.put(resultdata[1], Integer.valueOf(resultdata[0]));
        }
        connection.getDbconnection().close();
        return countMap;
    }

    public Map<String,Integer> getOfferCountSellerwiseConcise() throws SQLException {

        Map<String,Integer> countMap = new HashMap<>();

        DbConnection connection = new DbConnection();

        String query = "SELECT count(offerid) || ',' || fname || ' ' || lname FROM productoffers NATURAL JOIN userdetails GROUP BY username,fname,lname"; // DATA MANIPULATION COMMAND
        Statement statement = null;
        ResultSet resultSet = null;
        statement = connection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        while (resultSet.next())
        {
            String resultstring = resultSet.getString(1);
            String[] resultdata = resultstring.split(",");
            countMap.put(resultdata[1], Integer.valueOf(resultdata[0]));
        }
        connection.getDbconnection().close();
        return countMap;

    }


}

