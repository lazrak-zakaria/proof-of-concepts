package com.part1.demo.configs;


import com.part1.demo.classes.Parrot;
import com.part1.demo.classes.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.name = "KOKO";
        return p;
    }


    @Bean
    Person person(Parrot p){
        var person = new Person();
        person.name = "Lalo";
        person.parrot = p;
        return person;
    }
}
