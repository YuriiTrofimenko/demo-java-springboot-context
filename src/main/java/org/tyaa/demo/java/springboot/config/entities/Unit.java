package org.tyaa.demo.java.springboot.config.entities;

import org.springframework.stereotype.Component;

/* Annotations approach */
@Component
public class Unit {

    public String name = "King";
    public String race;
    //public String weapon;
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }
}
