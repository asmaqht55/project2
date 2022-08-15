package com.example.ecommerce;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RequestMapping("abi/v1/amz")
@RestController
public class merchantcontroller {
    ArrayList<merchant> merchantlist=new ArrayList<>();
    @GetMapping("/amz")
    public ResponseEntity getuser(){
        return ResponseEntity.status(200).body(merchantlist);
    }
    @PostMapping
    public ResponseEntity adduser(@RequestBody @Valid merchant mee, Errors errors ) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new APi(message, 400));
        }
        merchantlist.add(mee);
        return ResponseEntity.status(201).body(new APi("New user added !", 201));
    }
    @PutMapping("/amz/{index}")
    public ResponseEntity updateuser(@RequestBody @Valid merchant mee ,@PathVariable int index,Errors errors){
        if(errors.hasErrors()){
            String message=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new APi(message,400));
        }
        merchantlist.set(index,mee);
        return ResponseEntity.status(201).body( new APi("User updated !",201));
    }
    @DeleteMapping("/amz/{index}")
    public ResponseEntity deleteuser(@PathVariable int index){
        merchantlist.remove(index);
        return ResponseEntity.status(200).body(new APi("User deleted !",200));
    }
}
