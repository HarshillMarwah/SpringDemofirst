package org.example;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Creating Desktop OBJ");
    }

    @Override
    public void compile() {
        System.out.println("Compiling @ Desktop");
    }
}
