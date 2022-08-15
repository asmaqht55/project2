package com.example.ecommerce;

import java.util.ArrayList;

public class merchantservices {
    private ArrayList<merchant> merchantlist=new ArrayList<>();
    public ArrayList<merchant> getUsers() {return merchantlist;}
    public void adduser(merchant Merchant){merchantlist.add(Merchant);}
    public void updetuser(int index,merchant Merchant)
    {merchantlist.set(index,Merchant);}
    public void deleteuser(int index){merchantlist.remove(index);}

}
