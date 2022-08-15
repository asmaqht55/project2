package com.example.ecommerce;

import jdk.jfr.Category;

import java.util.ArrayList;

public class categoryservices {
    private ArrayList<category> categorylist=new ArrayList<>();
    public ArrayList<category> getUsers() {return categorylist;}
    public void adduser(category Category){categorylist.add(Category);}
    public void updetuser(int index,category Category)
    {categorylist.set(index,Category);}
    public void deleteuser(int index){categorylist.remove(index);}

}
