package com.tcs.main;

public interface Profile
{
    public static void updateProfile(){}; // it's not part of the contract that other classes have to fulfil
    public void deleteProfile(); // This method does not have a BODY | It is Abstract
    public void createProfile(); // This method does not have a BODY | It is Abstract
}
