package com.herit.compteBancaire;

import java.util.ArrayList;
import java.util.List;

public class User{
   public String name;
   public String lastname;
   public Compte myaccount;
   public String email ;
   public String pwd;


    public User(String name, String lastname, String email, String pwd) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.pwd = pwd;
        this.myaccount = new Compte();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", myaccount=" + myaccount +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }


}
