package com.example.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
@AllArgsConstructor@Data
public class product {
    @NotNull (message ="ID CAN'T BE NULL ")
    @Length (max = 3,message ="The ID must be shorter")
    private int id;

    @NotEmpty(message ="Must be not Empty")
    @Length(max = 3,message ="The name must be shorter" )
    private String name;

    @NotNull(message ="Price Can't Be NULL !")
    @Positive(message ="The number must be positive")
    private int price;

}
