package com.tcs.main;

import com.tcs.dao.*;
import com.tcs.side.Order;
import com.tcs.side.ProductOffer;
import org.apache.commons.codec.digest.DigestUtils;

import java.sql.SQLException;
import java.util.*;

public class TestDB
{
    void redirectBuyerDashboard(String username) throws SQLException
    {
        List<ProductOffer> offerList = new ArrayList<>();
        System.out.println("******** BUYER DASHBOARD ********");

        ProductOfferDAO offerDAO = new ProductOfferDAO();
        offerList = offerDAO.fetchOffers();

        printAllOffers(offerList);

        String orderInput;

        while(true)
        {
            System.out.println("****************");
            System.out.println("Place New Order (1) | Delete an Offer (2) | Update an Offer (3) ? ");

            Scanner in = new Scanner(System.in);
            int offerInput = in.nextInt();

            System.out.print("Please enter the Order Serial Number: ");
            int orderSerial = in.nextInt();

            int random = ((int) (Math.random()*10000.0));
            String orderId = String.valueOf(random);

            ProductOffer offer = offerList.get(orderSerial-1);

            Order order = new Order(orderId);
            order.setUsername(username);
            order.setOfferId(offer.getOfferId());

            OrderDAO orderDAO = new OrderDAO();
            orderDAO.placeOrder(order);



        }

    }

    void redirectSellerDashboard(String username) throws SQLException
    {
        List<ProductOffer> offerList = new ArrayList<>();

        System.out.println("******** SELLER DASHBOARD ********");
        showOrders(username);

        ProductOfferDAO offerDAO = new ProductOfferDAO();
        offerList = offerDAO.fetchOffers(username);

        int offerCntr = 1;
        for (  ProductOffer offer: offerList  )
        {
            System.out.println(offerCntr+". "+offer);
            offerCntr++;
        }

        while(true)
        {
            System.out.println("****************");
            System.out.println("Create New Offer (1) | Delete an Offer (2) | Update an Offer (3) ? ");

            Scanner in = new Scanner(System.in);
            int offerInput = in.nextInt();

            if(offerInput == 1)
            {
                System.out.print("HSCODE: ");
                String hscode = in.next();
                System.out.print("OFFERNAME: ");
                String offerName = in.next();
                System.out.print("QTY: ");
                String qty = in.next();
                System.out.print("UNIT: ");
                String unit = in.next();
                System.out.print("UNITPRICE: ");
                String unitPrice = in.next();

                int random = ((int) (Math.random()*10000.0));
                String offerId = String.valueOf(random);

                ProductOffer productOffer = new ProductOffer(offerId,username);
                productOffer.setHscode(hscode);
                productOffer.setOfferName(offerName);
                productOffer.setQty(Integer.parseInt(qty));
                productOffer.setUnit(unit);
                productOffer.setUnitprice(Float.parseFloat(unitPrice));

                ProductOfferDAO productOfferDAO = new ProductOfferDAO();
                productOfferDAO.createOffer(productOffer);
            }
            else if (offerInput == 2)
            {

                System.out.println("Please enter the Offer Serial Number to be Deleted: ");
               int delserail = in.nextInt();
               String delOfferId = offerList.get(delserail-1).getOfferId();
               offerDAO.deleteOffer(delOfferId);

            }


        }
    }

    void redirectAdminDashboard(String username) throws SQLException
    {
        System.out.println("******** ADMIN DASHBOARD FOR "+username+" ********");



        AdminDAO adminDAO = new AdminDAO();

        System.out.println("TOTAL NUMBER OF OFFERS: "+ adminDAO.getOfferCount());
        Map<String,Integer> sellerOfferMap = adminDAO.getOfferCountSellerwiseConcise();
        int sellerCntr = 1;
        for ( Map.Entry entry: sellerOfferMap.entrySet())
        {
            System.out.println("    "+sellerCntr+". "+entry.getKey()+" TOTAL OFFERS: "+entry.getValue());
            sellerCntr++;
        }

        System.out.println("TOTAL NUMBER OF ORDERS: "+ adminDAO.getOrderCount());
        Map<String,Integer> buyerOfferMap = adminDAO.getOrderCountBuyerwiseConcise();
        int buyerCntr = 1;
        for ( Map.Entry entry: buyerOfferMap.entrySet())
        {
            System.out.println("    "+buyerCntr+". "+entry.getKey()+" TOTAL ORDERS: "+entry.getValue());
            buyerCntr++;
        }




    }

    void printAllOffers(List<ProductOffer> offerList) throws SQLException
    {

        ProductOfferDAO offerDAO = new ProductOfferDAO();


        System.out.println("******** LIST OF OFFERS ********");

        System.out.println("    SELLER          OFFER                      HSCODE      UNIT         UNIT-PRICE        QTY");

        int offerCntr = 1;
        for (ProductOffer offer : offerList)
        {
            System.out.println(offerCntr+". "+offer.getUsername()+
                    "           "+offer.getOfferName()+"" +
                    "     "+offer.getHscode()+"" +
                    "       "+offer.getUnit()+
                    "           "+offer.getUnitprice()+
                    "           "+offer.getQty());
            offerCntr++;
        }

    }

    void printAllOrders() throws SQLException {


        System.out.println("******** LIST OF ORDERS ********");

        OrderDAO orderDAO = new OrderDAO();
        List<Order> orderList = orderDAO.fetchOrders();

        orderList.forEach(order -> System.out.println(order));

    }


    void showOrders(String username)
    {


    }

    void showOrders()
    {

    }



    public static void main(String[] args) throws Exception
    {
        TestDB app = new TestDB();

        System.out.println("***Welcome to TCS Cross Border Trade App***");
        Scanner authInput  = new Scanner(System.in);

        System.out.print("LOGIN(1)/SIGNUP(2) | LOGIN as ADMIN(3) ?");
        int initFlow = authInput.nextInt();

        if(initFlow == 1)
        {
            System.out.print("Username: ");
            String username = authInput.next();

            CredentialDAO credentialDAO = new CredentialDAO();
            String md5db = credentialDAO.getPassword(username);

            if(md5db == null )
            {
                System.out.println("Invalid Username!");
            }
            else
            {
                System.out.print("Password: ");
                String password = authInput.next();
                String md5Hex = DigestUtils.md5Hex(password).toUpperCase();

                if(md5Hex.equals(md5db))
                {
                    System.out.println("Welcome "+username);
                    //System.out.println(new UserDetailsDAO().fetchUserDetails(username));

                    TypeDAO typeDAO = new TypeDAO();
                    Type userType = null;

                    if( (userType = typeDAO.fetchUserType(username)) != null)
                    {
                        if(userType.equals(Type.BUYER))
                        {
                            app.redirectBuyerDashboard(username);
                        }
                        else if (userType.equals(Type.SELLER))
                        {
                            app.redirectSellerDashboard(username);
                        }
                    }


                }
                else {
                    System.out.println("Incorrect Password!");
                }

            }

        } else if (initFlow == 2)
        {

            CredentialDAO credentialDAO = new CredentialDAO();
            System.out.print("Username: ");
            String username = authInput.next();
            System.out.print("Password: ");
            String password = authInput.next();
            String md5Hex = DigestUtils.md5Hex(password).toUpperCase();

            credentialDAO.signup(username,md5Hex);

            System.out.println("You've Signed up!");

            System.out.println("********* UPDATE YOUR DETAILS ***********");
            System.out.print("First Name: ");
            String fname = authInput.next();
            System.out.print("Last Name: ");
            String lname = authInput.next();
            System.out.print("Phone: ");
            String phone = authInput.next();
            System.out.print("Email: ");
            String email = authInput.next();

            UserDetailsDAO userDetailsDAO = new UserDetailsDAO();
            userDetailsDAO.saveUserDetails(username,fname,lname,email,phone);

            System.out.println("********* SELECT YOUR ROLE - FROM BUYER(1)/SELLER(2) | ADMIN(3) ***********");
            int type = authInput.nextInt();
            Type userType = null;

            switch (type)
            {
                case 1 : userType = Type.BUYER;break;
                case 2 : userType = Type.SELLER;break;
                case 3 : userType = Type.ADMIN;break;
                default: throw new Exception();
            }

            UserTypeDAO userTypeDAO = new UserTypeDAO();
            userTypeDAO.saveUserType(username, userType);

        } else if (initFlow == 3)
        {
            System.out.print("Username: ");
            String username = authInput.next();

            CredentialDAO credentialDAO = new CredentialDAO();
            String md5db = credentialDAO.getPassword(username);

            if(md5db == null )
            {
                System.out.println("Invalid Username!");
            }
            else
            {
                System.out.print("Password: ");
                String password = authInput.next();
                String md5Hex = DigestUtils.md5Hex(password).toUpperCase();

                if(md5Hex.equals(md5db))
                {
                    //System.out.println("Welcome ADMIN "+username);
                    //System.out.println(new UserDetailsDAO().fetchUserDetails(username));
                    app.redirectAdminDashboard(username);
                }
                else
                {
                    System.out.println("Incorrect Password!");
                }

            }

        }


    }
}
