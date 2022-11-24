package com.tcs.side;

import com.tcs.dao.Type;

public class UserType
{
    String username;
    Type type;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public Type getType() {
        return type;
    }
}
