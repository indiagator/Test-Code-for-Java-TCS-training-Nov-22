package com.tcs.side;

public class ProductOffer
{
    final String offerId; // @ID
    final String username;
    String hscode; // 8 Digit Code
    String offerName;
    int qty;
    String unit;
    float unitprice;

    public ProductOffer(String offerId, String username) {
        this.offerId = offerId;
        this.username = username;
    }

    public void setHscode(String hscode) {
        this.hscode = hscode;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setUnitprice(float unitprice) {
        this.unitprice = unitprice;
    }

    public String getUsername() {
        return username;
    }

    public String getOfferId() {
        return offerId;
    }

    public int getQty() {
        return qty;
    }

    public float getUnitprice() {
        return unitprice;
    }

    public String getHscode() {
        return hscode;
    }

    public String getOfferName() {
        return offerName;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "{" +
                "offerId='" + offerId + '\'' +
                ", hscode='" + hscode + '\'' +
                ", offerName='" + offerName + '\'' +
                ", qty=" + qty +
                ", unit='" + unit + '\'' +
                ", unitprice=" + unitprice +
                '}';
    }
}
