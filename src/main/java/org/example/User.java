package org.example;

public class User {

    String name;
    short age;
    int height;

    public User (String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User (short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public User (int height, String name, short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }
    public User (String name, int height, short age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public User (short age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User (int height, short age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
