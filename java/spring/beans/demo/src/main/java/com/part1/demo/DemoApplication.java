package com.part1.demo;

import com.part1.demo.classes.ComponentClass;
import com.part1.demo.classes.Parrot;
import com.part1.demo.classes.Person;
import com.part1.demo.configs.ComponentScanConfig;
import com.part1.demo.configs.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class, ComponentScanConfig.class);

		Person person = context.getBean(Person.class);
		System.out.println(person.parrot);

	}


}
