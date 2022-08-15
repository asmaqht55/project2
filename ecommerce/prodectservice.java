package com.example.ecommerce;

import com.example.ecommerce.product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
@RequiredArgsConstructor
public class prodectservice {
    private ArrayList<product> productList=new ArrayList<>();
    public ArrayList<product> getUsers() {return productList;}
    public void adduser(product Product){productList.add(Product);}
    public void updetuser(int index,product Product)
    {productList.set(index,Product);}
    public void deleteuser(int index){productList.remove(index);}

}
