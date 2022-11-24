package com.tcs.side;

public class Order
{
    final String orderId;
    String username;
    String offerId;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setOfferId(String offerId)
    {
        this.offerId = offerId;
    }

    public String getUsername() {
        return username;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOfferId() {
        return offerId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", username='" + username + '\'' +
                ", offerId='" + offerId + '\'' +
                '}';
    }
}
