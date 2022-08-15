package com.example.ecommerce;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;


@RestController@RequestMapping("APi/v1/amz")
public class productcontroller {
    ArrayList<product> prodectlist=new ArrayList<>();

    @GetMapping("/amz")
    public ResponseEntity getprodect(){
        return ResponseEntity.status(200).body(prodectlist);
    }
    @PostMapping
    public ResponseEntity addprodect(@RequestBody @Valid product p, Errors errors ){
        if(errors.hasErrors()){
            String message=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new APi(message,400));
        }
        prodectlist.add(p);
        return ResponseEntity.status(201).body( new APi("New user added !",201));
    }
    @PutMapping("/amz/{index}")
    public ResponseEntity updateprodect(@RequestBody @Valid product p ,@PathVariable int index,Errors errors){
        if(errors.hasErrors()){
            String message=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new APi(message,400));
        }
        prodectlist.set(index,p);
        return ResponseEntity.status(201).body( new APi("User updated !",201));
    }

    @DeleteMapping("/amz/{index}")
    public ResponseEntity deleteprodect(@PathVariable int index){
        prodectlist.remove(index);
        return ResponseEntity.status(200).body(new APi("User deleted !",200));
    }

}
