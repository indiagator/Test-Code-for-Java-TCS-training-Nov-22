package com.tcs.dao;

import com.tcs.side.Order;
import com.tcs.side.ProductOffer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO
{
    public void placeOrder(Order order) throws SQLException
    {
        DbConnection connection = new DbConnection();

        String query = "INSERT INTO orders(orderid,username,offerid) VALUES ('"+order.getOrderId()+"','"+order.getUsername()+
                "','"+order.getOfferId()+"')";
        Statement statement = connection.getDbconnection().createStatement();
        statement.execute(query);

        connection.getDbconnection().close();
    }

    public List<Order> fetchOrders() throws SQLException
    {

        DbConnection connection = new DbConnection();
        List<Order> orderList= new ArrayList<>();
        //fetch orders from a specific seller


        String query = "SELECT * FROM orders"; // DATA MANIPULATION COMMAND

        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        while(resultSet.next())
        {
            String orderId = resultSet.getString(1);
            String username = resultSet.getString(2);
            String offerId = resultSet.getString(3);

            Order order = new Order(orderId);
            order.setUsername(username);
            order.setOfferId(offerId);

            orderList.add(order);
        }
        connection.getDbconnection().close();

        return orderList;
    }

    public void deleteOrder(String orderId) throws SQLException
    {
        DbConnection connection = new DbConnection();

        String delQuery = "DELETE FROM orders WHERE orderid='"+orderId+"'";

        Statement statement = connection.getDbconnection().createStatement();
        statement.execute(delQuery);

        connection.getDbconnection().close();

    }

}
