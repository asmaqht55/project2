package com.example.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data@AllArgsConstructor
@Service
public class merchantStock {
    @NotNull(message ="ID CAN'T BE NULL ")
    @Length(max = 3,message ="The ID must be shorter")
    private int id;

    @NotNull(message =" CAN'T BE NULL")
    @Length(max = 3,message =" MUST BE SHORTER THAN 3 CHAR")
    private int productid;

    @NotNull(message ="CAN'T BE NULL !")
    @Length(message = "MUST BE SHORTER THAN 3 CHAR")
    private int merchantid;

    @NotEmpty(message ="CAN'T BE NULL")
    @Length(min=10,message = "Must be longer !")
    private String stock;
}
