package org.example;
public class AddressBook {
    public static void main(String[] args)
    {
        System.out.println("Welcome To AddressBook System");
        Add addDetails=new Add();
        addDetails.addContact();
        addDetails.editContact();
        addDetails.deleteContact();
    }
}