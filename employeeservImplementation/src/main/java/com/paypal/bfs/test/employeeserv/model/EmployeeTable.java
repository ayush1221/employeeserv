package com.paypal.bfs.test.employeeserv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeTable {

    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String country;
    private String zip_code;

}
