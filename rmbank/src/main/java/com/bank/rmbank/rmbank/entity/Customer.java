package com.bank.rmbank.rmbank.entity;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private int age;
    private int accountNo;

   

    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int custId){
       this.customerId=custId;
    }

    public int getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(int accntNo){
         this.accountNo=accntNo;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String custName){
        this.customerName=custName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    }