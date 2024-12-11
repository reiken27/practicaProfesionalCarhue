package com.practica.profesional.practicaProfesionalCarhue.model;

import java.time.LocalDateTime;
import java.util.Map;

public class Customer
{


    private Integer customerId;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String emailId;
    private String password;
    private LocalDateTime createdOn;
    private CreditCard creditCard;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "customer_address_mapping",
            joinColumns = {
                    @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "address_id", referencedColumnName = "addressId")
            })
    private Map<String, Address> address = new HashMap<>();





    private List<Order> orders = new ArrayList<>();

    private Cart customerCart;


}
