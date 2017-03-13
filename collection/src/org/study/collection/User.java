package org.study.collection;

import java.io.Serializable;

public class User implements Serializable
{
    private static final long serialVersionUID = 8294180014912103005L;

    private transient String password;

    private String userName;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


}
