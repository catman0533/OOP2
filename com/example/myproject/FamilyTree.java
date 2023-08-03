package com.example.myproject;


import  com.example.myproject.Main;
import  com.example.myproject.Person;
import  com.example.myproject.FileHandler;
import  com.example.myproject.FamilyMember;
import  com.example.myproject.FamilyTree;
    

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;



class FamilyTree < T extends FamilyMember>implements Iterable<T> , Serializable{
    private List<T> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(T person) {
        people.add(person);
    }

    public T getPerson(int index) {
        return people.get(index);
    }

    public List<T> getPeople() {
        return people;
    }

    public void sortByName() {
        people.sort(Comparator.comparing(T::getName));
    }

    public void sortByBirthDate() {
        people.sort(Comparator.comparing(T::getBirthDate));
    }

    @Override
    public Iterator<T> iterator() {
        return people.iterator();
    }
}
