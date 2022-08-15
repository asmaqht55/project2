package com.example.ecommerce;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("abi/v1/amz")
@RequiredArgsConstructor
public class merchantStockcon {

private final merchantservices Merchantservices;

@GetMapping
 public ResponseEntity<ArrayList<merchant>> getprodect(){
    return ResponseEntity.status(HttpStatus.OK).body(merchantStockservices.getprodect());
}
@GetMapping("prodect")
    public ResponseEntity<ArrayList<merchant>>getprodect(PathVariable String product){
    ArrayList<merchant>prodect=merchantStock.getprodect(product);
    return ResponseEntity.status(HttpStatus.OK).body(prodect);
}
@PutMapping
    public ResponseEntity<String>addprodect(@RequestBody @Valid product Product, Errors errors) {
    if (errors.hasErrors()) {
        String message = errors.getFieldError().getDefaultMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
    }
boolean isProductAdded=prodectservice.addprodect(product);
    if(!isprodectAdded){
        return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Server error !");
    }
    return ResponseEntity.status(HttpStatus.CREATED).body("New prodect added !");
}
@PostMapping("/Purches")
    public ResponseEntity<String>purchesprodect(@RequestParam int id,String name )
}
