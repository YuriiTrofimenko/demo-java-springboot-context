package org.tyaa.demo.java.springboot.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tyaa.demo.java.springboot.config.entities.Unit;
import org.tyaa.demo.java.springboot.config.entities.Weapon;

@Configuration
public class AppConfig {

    @Bean
    public Unit kingUnit() {
        Unit u = new Unit();
        return u;
    }

    @Bean
    public Unit dragonUnit() {
        Unit u = new Unit();
        u.name = "Dragon";
        return u;
    }

    @Bean
    public Unit knightUnit() {
        Unit u = new Unit();
        u.name = "Knight";
        return u;
    }

    @Bean(name = "weapon-sword")
    public Weapon getSword() {
        Weapon weapon = new Weapon();
        weapon.name = "sword";
        return weapon;
    }

    @Bean("weapon-axe")
    // @Qualifier(value = "weapon-axe")
    public Weapon getWeapon() {
        Weapon weapon = new Weapon();
        weapon.name = "axe";
        return weapon;
    }

    @Bean("warrior")
    public Unit getWarrior(@Qualifier(value = "weapon-sword") Weapon _weapon) {
        Unit unit = new Unit();
        unit.name = _weapon.getName() + "sman";
        return unit;
    }
}
