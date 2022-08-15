package com.example.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RequestMapping("/APi/v1/amz")
@RestController
public class userscontroller {
    ArrayList<users> userslist=new ArrayList<>();
    @GetMapping("/amz")
    public ResponseEntity getuser(){
        return ResponseEntity.status(200).body(userslist);
    }
    @PostMapping
    public ResponseEntity adduser(@RequestBody @Valid users user, Errors errors ) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new APi(message, 400));
        }
        userslist.add(user);
        return ResponseEntity.status(201).body(new APi("New user added !", 201));
    }
    @PutMapping("/amz/{index}")
    public ResponseEntity updateuser(@RequestBody @Valid users user ,@PathVariable int index,Errors errors){
        if(errors.hasErrors()){
            String message=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new APi(message,400));
        }
        userslist.set(index,user);
        return ResponseEntity.status(201).body( new APi("User updated !",201));
    }
    @DeleteMapping("/amz/{index}")
    public ResponseEntity deleteuser(@PathVariable int index){
        userslist.remove(index);
        return ResponseEntity.status(200).body(new APi("User deleted !",200));
    }
}
