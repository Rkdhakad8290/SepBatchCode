package com.destination.sepBatchProgram.nov19;

import java.util.*;

class InvalidUserNameException extends Exception{
 public String getMessage() {
  return "Invalid Username..Please try again";
 }
}

class InvalidPasswordException extends Exception{
 public String getMessage() {
  return "Invalid Password. please try again";
 }
}

class Customer{
 String user_name;
 String user_name_original="Jeevesh";
 String user_password;
 String user_password_original="JKJ123";
 
 void collectData() {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the username:");
  user_name=sc.next();
  System.out.println("Enter the password:");
  user_password=sc.next();
 }
 
 void validate() throws InvalidUserNameException,InvalidPasswordException {
  if(user_name.equals(user_name_original)==true) {
   if(user_password.endsWith(user_password_original)==true) {
    System.out.println("Hello user welcome to the page");
    }
   else {
    InvalidPasswordException ip=new InvalidPasswordException();
    System.out.println(ip.getMessage());
    throw ip;
   }
  }
  else {
   InvalidUserNameException iu=new InvalidUserNameException();
   System.out.println(iu.getMessage());
   throw iu;
  }
 }
}

class ATM{
 void verify(Customer c) {
  try {
   c.collectData();
   c.validate();
  }
  catch(Exception e1) {
   try {
    c.collectData();
    c.validate();
   }
   catch(Exception e2) {
    try {
     c.collectData();
     c.validate();
    }
    catch(Exception e3) {
     System.out.println("User Account bloacked");
    }
   }
  }
 }
}
public class CustomEx {
 public static void main(String[] args) {
  Customer c=new Customer();
  ATM a=new ATM();
  a.verify(c);
 } 
}