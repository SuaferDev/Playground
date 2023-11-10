package org.example;

@DoParse
public class User {
    private String name;
    private int age;
    private String[] hobby;

    private int h;

    public User(){

    }


    public User(String name, int age, String[] hobby, int h) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.h = h;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void say(){
        System.out.println("Hi, I am "+name+", my age: "+age);
    }
}
