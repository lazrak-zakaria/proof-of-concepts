package com.part1.demo;

import com.part1.demo.classes.Parrot;
import com.part1.demo.configs.ComponentScanConfig;
import com.part1.demo.configs.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class, ComponentScanConfig.class);

		Parrot p =  context.getBean(Parrot.class);
		System.out.println(p.name);


		ComponentClass c = context.getBean(ComponentClass.class);
		System.out.println(c.name); // null

	}


}
