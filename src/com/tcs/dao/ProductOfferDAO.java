package com.tcs.dao;

import com.tcs.side.Order;
import com.tcs.side.ProductOffer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductOfferDAO
{
    public void createOffer(ProductOffer offer) throws SQLException
    {
        DbConnection connection = new DbConnection();

        String query = "INSERT INTO productoffers(offerid,username,hscode,offername,qty,unit,unitprice) VALUES " +
                "('"+offer.getOfferId()+"','" +
                offer.getUsername()+"','" +
                offer.getHscode()+"','" +
                offer.getOfferName()+"'," +
                offer.getQty()+",'" +
                offer.getUnit()+"'," +
                offer.getUnitprice()+")";

        Statement statement = connection.getDbconnection().createStatement();
        statement.execute(query);

        connection.getDbconnection().close();
    }

    public List<ProductOffer> fetchOffers(String username) throws SQLException
    {
        DbConnection connection = new DbConnection();
        List<ProductOffer> offerList= new ArrayList<>();
            //fetch orders from a specific seller


        String query = "SELECT * FROM productoffers WHERE username='"+username+"'  "; // DATA MANIPULATION COMMAND

        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        while(resultSet.next())
        {
            String offerId = resultSet.getString(1);
            String hscode = resultSet.getString(3);
            String offername = resultSet.getString(4);
            String qty = resultSet.getString(5);
            String unit = resultSet.getString(6);
            String unitprice = resultSet.getString(7);

            ProductOffer productOffer = new ProductOffer(offerId, username);
            productOffer.setOfferName(offername);
            productOffer.setQty(Integer.parseInt(qty));
            productOffer.setHscode(hscode);
            productOffer.setUnit(unit);
            productOffer.setUnitprice(Float.parseFloat(unitprice));

            offerList.add(productOffer);

        }
        connection.getDbconnection().close();
        return offerList;
    }

    public List<ProductOffer> fetchOffers() throws SQLException
    {
        // fetch orders from all sellers
        DbConnection connection = new DbConnection();
        List<ProductOffer> offerList= new ArrayList<>();
        //fetch orders from a specific seller


        String query = "SELECT * FROM productoffers"; // DATA MANIPULATION COMMAND

        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        while(resultSet.next())
        {
            String offerId = resultSet.getString(1);
            String username = resultSet.getString(2);
            String hscode = resultSet.getString(3);
            String offername = resultSet.getString(4);
            String qty = resultSet.getString(5);
            String unit = resultSet.getString(6);
            String unitprice = resultSet.getString(7);

            ProductOffer productOffer = new ProductOffer(offerId, username);
            productOffer.setOfferName(offername);
            productOffer.setQty(Integer.parseInt(qty));
            productOffer.setHscode(hscode);
            productOffer.setUnit(unit);
            productOffer.setUnitprice(Float.parseFloat(unitprice));

            offerList.add(productOffer);

        }
        connection.getDbconnection().close();
        return offerList;
    }
}
