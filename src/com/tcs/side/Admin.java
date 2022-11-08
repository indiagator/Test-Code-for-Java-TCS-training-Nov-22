package com.tcs.side;

public class Admin extends User {

    public Admin(String username) {
        super(username);
    }

    @Override // hiding the method from the superclass
    public void getEncryptedPassword()
    {
        super.getEncryptedPassword();
        //Your own code here
    }
}
