package com.capovskyAlexandr.zonkytest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Currency;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(unique = true,nullable = false)
    String userName;
    @Column(nullable = false)
    Integer age;
    BigDecimal currentMoneyBalance;

    Currency moneyInCurrency;

    public CustomerEntity(Integer id, String userName, Integer age){
        this.id=id;
        this.userName=userName;
        this.age=age;
    }



}
