package com.example.myproject;


import  com.example.myproject.Main;
import  com.example.myproject.Person;
import  com.example.myproject.FileHandler;
import  com.example.myproject.FamilyMember;
import  com.example.myproject.FamilyTree;
    

public interface FamilyMember {
    String getName();
    int getAge();
    // int getPerson();
    int sortByBirthDate();
}
