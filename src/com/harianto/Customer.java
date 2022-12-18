package com.harianto;

public abstract class Customer {
    protected String CustomerNama;
    protected String CustomerPhone;
    public String getNama(){
        return this.CustomerNama;
    }
    public void setNama(String n){
        this.CustomerNama = n;
    }
    public String getTelpon(){
        return this.CustomerPhone;
    }
    public void setTelepon(String t){
        this.CustomerPhone = t;
    }
}

