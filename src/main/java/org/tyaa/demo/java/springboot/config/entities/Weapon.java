package org.tyaa.demo.java.springboot.config.entities;

import org.springframework.stereotype.Component;

/* Annotations approach */
@Component("weapon-spear")
public class Weapon {

    public String name = "spear";
    public Integer power;

    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }
}

