package com.bank.rmbank.rmbank.entity;

public class Account {
    private int accntNo;
    private String type;
    private int customerId;
    private int balance;


public int getCustomerId(){
    return customerId;
}
public void setCustomerId(int custId){
   this.customerId=custId;
}

public int getAccountNo(){
    return accntNo;
}
public void setAccountNo(int accntNo){
     this.accntNo=accntNo;
}

public String getType(){
    return type;
}
public void setType(String type){
    this.type=type;
}



public int getbalance(){
    return balance;
}
public void setbalance(int balance){
    this.balance=balance;
}

}
