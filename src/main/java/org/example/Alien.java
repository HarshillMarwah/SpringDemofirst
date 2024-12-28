package org.example;

public class Alien {
    private int age=5;
    private Laptop lap;
    public Alien(){
       // age=0;
        System.out.println("Alien OBJ created; age="+age);
    }

    public int getAge() {
        return age;
    }

    public Alien(Laptop lap, int age) {
        this.lap = lap;
        this.age = age;
    }

    public Alien(int age) {
        System.out.println("this.age="+this.age);
        System.out.println("age="+age);
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void setAge(int age) {
        System.out.println("Inside setter");
        this.age = age;
    }

    public void code()
    {
        System.out.println("In function code.");
       // lap.compile();
    }
}
