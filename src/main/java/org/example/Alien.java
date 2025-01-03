package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("alien1")
public class Alien {
    @Value("21")
    private int age = 5;
    private Computer com;

    public Alien() {
        // age=0;
        //System.out.println("Alien OBJ created; age=" + age);
    }


    public Alien(Computer com, int age) {
        this.com = com;
        this.age = age;
    }

    public Alien(int age) {
        System.out.println("this.age=" + this.age);
        System.out.println("age=" + age);
        this.age = age;
    }

    public void code() {
        System.out.println("In function code.");
        com.compile();
        // lap.compile();
    }

    //Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Inside setter");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }
}
