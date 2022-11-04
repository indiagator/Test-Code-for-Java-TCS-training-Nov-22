package com.tcs.side;

import com.tcs.main.Profile;

public class User implements Profile { //SuperClass

    String username;
    String password;
    String email;
    String phone;
    String city;

    public User(String username)
    {
        this.username = username;
    }

    protected  String getUsername() {
        return username;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    protected String getPassword() {
        return password;
    }

    protected String getEmail() {
        return email;
    }

    protected String getCity() {
        return city;
    }

    protected String getPhone() {
        return phone;
    }

    protected static void getData()
    {

    }

    @Override
    public void deleteProfile() {


    }

    @Override
    public void createProfile() {

    }
}
