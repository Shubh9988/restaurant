package com.Anish.Anish.Restaurant.Model;


import lombok.Data;

@Data
public class Restaurant {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String speciality;
    private Integer totalStaff;

}
