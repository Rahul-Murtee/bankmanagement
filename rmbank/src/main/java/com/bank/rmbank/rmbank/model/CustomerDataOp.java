package com.bank.rmbank.rmbank.model;

import java.util.ArrayList;

import java.util.Scanner;

import com.bank.rmbank.rmbank.entity.Customer;

public class CustomerDataOp {
    // method for getting customer detail
    // add new customer
     ArrayList<String> custData = new ArrayList<>();
Scanner sc = new Scanner(System.in);
    // update customer details
    int accntNo=0;
    public String addCustomer(){
        Customer customer = new Customer();
        System.out.println("Enter user name :");
        String custName = sc.next();
        System.out.println("Enter account no. :");
        int accntNo = sc.nextInt();
        if(customer!=null && customer.getAccountNo()!=0){
            if(customer.getAccountNo()!=0){
                 accntNo = customer.getAccountNo() +1;
            }else{
                accntNo=1;
            }
        }
            customer.setAccountNo(accntNo);
            customer.setCustomerName(custName);
            
        return "Succefully created user";
    }
    public ArrayList<String> getCustomerData(){
        return custData;
    }
}
