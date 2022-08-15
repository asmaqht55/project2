package com.example.ecommerce;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class usersservices {
    private ArrayList<users> userlist=new ArrayList<>();
    public ArrayList<users> getUsers() {return userlist;}
    public void adduser(users Users){userlist.add(Users);}
    public void updetuser(int index,users Users)
    {userlist.set(index,Users);}
    public void deleteuser(int index){userlist.remove(index);}

}
