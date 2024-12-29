package com.example.demo;


public class Ingredient {
 
public String id;
private  String name;
 private Type type;
 public enum Type {
 WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
 }
 public Ingredient(String id,String name,Type type)
 {
    this.id=id;
    this.name = name;
    this.type= type;
 }
 public String getId() {
    return id;
}

// Сеттер для id
public void setId(String id) {
    this.id = id;
}

// Геттер для name
public String getName() {
    return name;
}

// Сеттер для name
public void setName(String name) {
    this.name = name;
}

// Геттер для type
public Type getType() {
    return type;
}

// Сеттер для type
public void setType(Type type) {
    this.type = type;
}
@Override
 public String toString()
 {
    String res= "Ingredient(id=";
    String res2 =", name = ";
    String res3=", type = ";
    String res4=" )";
    return res+id+res2+name+res3+type+res4;
 }
 
}