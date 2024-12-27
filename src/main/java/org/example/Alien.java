package org.example;

public class Alien {
    private int age;
    public Alien(){
       // age=0;
        System.out.println("Alien OBJ created; age="+age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Inside setter");
        this.age = age;
    }

    public void code()
    {
        System.out.println("In function code.");
    }
}
