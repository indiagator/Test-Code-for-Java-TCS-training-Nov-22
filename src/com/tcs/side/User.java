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

    public  String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public static void getData()
    {

    }
    public void getEncryptedPassword()
    {

    }

    @Override
    public void deleteProfile() {


    }

    @Override
    public void createProfile() {

    }
}
