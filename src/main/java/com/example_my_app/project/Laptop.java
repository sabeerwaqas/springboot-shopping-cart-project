package com.example_my_app.project;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void Compile(){
        System.out.println("Compile with laptop.");
    }
}
