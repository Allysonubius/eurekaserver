package com.livecoding.dio.customer.customer.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    private long id;
    private String name;
    private String address;

    public Customer(Long id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Column (name = "address", nullable = false)
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public Customer(){

    }

    @Override
    public String toString(){
        return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
}
