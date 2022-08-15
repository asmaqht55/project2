package com.example.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Service;

import javax.validation.constraints.*;

@AllArgsConstructor@Data
@Service
public class users {
    @NotEmpty(message ="ID Can't be NULL")
    @Length(max=3,message ="The ID must be shorter")
    private int id;

    @NotEmpty(message = "Can't be username Empty")
    @Length(max = 5,message = "Can't be longer than 5 char")
    private String username;

    @NotNull(message ="Can't be NULL !")
    @Length(max = 6,message = "Can't be longer than 6 char")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$",message = "must have digits and charctor in your password")
    private int password;

    @NotEmpty(message = "email can't be empty")
    @Email(message = "Please enter a valid email")
    private String email;

    @NotEmpty(message = "role can't be empty")
    @Pattern(regexp = "(admin|custmer)",message = "Role must be in admin or custmer only")
    private String role;

     @NotNull(message ="CAN'T BE EMPTY !")
     @Positive(message = "Sorry should be positive intgeer")
    private int balance;
}
