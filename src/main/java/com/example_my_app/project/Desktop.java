package com.example_my_app.project;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void Compile(){
        System.out.println("Compile with desktop.");
    }
}
