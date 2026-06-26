package com.clodomilson.erpapi.customer.entity;

import jakarta.persistence.*;
import lombok.*;
// Quando subir a aplicação, fala para o Hibernate criar uma tabela baseada nessa classe
@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 120)
    private String email;

    @Column(length = 20)
    private String phone;
}