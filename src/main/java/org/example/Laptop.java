package org.example;

public class Laptop implements Computer {
    public Laptop() {
       // System.out.println("Creating laptop");
    }
    @Override
    public void compile(){
        System.out.println("Code is compiling @ Laptop");
    }
}
