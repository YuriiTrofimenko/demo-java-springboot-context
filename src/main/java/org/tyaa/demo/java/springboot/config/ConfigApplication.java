package org.tyaa.demo.java.springboot.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tyaa.demo.java.springboot.config.entities.Building;
import org.tyaa.demo.java.springboot.config.entities.Unit;
import org.tyaa.demo.java.springboot.config.entities.Weapon;

@SpringBootApplication
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(
			Unit unit,
			Building building,
			Weapon weapon
	) {
		return args -> {
			/* Annotations approach */
			System.out.println(unit.getName());
			System.out.println(building.getName());
			System.out.println(weapon.getName());
		};
	}
}
