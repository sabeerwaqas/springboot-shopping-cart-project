package com.example_my_app.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    Computer comp;

    public void build(){
        System.out.println("Working on awesome project.");
        comp.Compile();
    }
}
