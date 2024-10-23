package com.example.angelogomez.exameblebyangelo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private Integer idClient;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String password;
}
