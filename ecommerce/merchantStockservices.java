package com.example.ecommerce;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class merchantStockservices {
    private ArrayList<merchant> merStocklist = new ArrayList<>();



    public ArrayList<merchant> getMerStocklist() {
        return merStocklist;
    }

    public void addmerchant(merchant Stoock) {
        merStocklist.add(Stoock);
    }
    public void updetmerchant(int index,merchant Stock) {
        merStocklist.set(index,Stock);
    }
    public void deletmerchant(int index,merchant Stock){
        merStocklist.remove(index);
    }
  public ArrayList<merchant>





}









}

