package com.commerce.commercebankfundraiser.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loginUser")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Login {

    @Id
    private String userId;
    private String password;
}
