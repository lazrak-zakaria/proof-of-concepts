package com.part1.demo;


import com.part1.demo.configs.ComponentScanConfig;
import com.part1.demo.configs.ProjectConfig;
import com.part1.demo.models.Comment;
import com.part1.demo.proxies.EmailCommentNotificationProxy;
import com.part1.demo.repositories.DBCommentRepository;
import com.part1.demo.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class, ComponentScanConfig.class);



		var commentService = context.getBean(CommentService.class);
		var comment = new Comment();

		commentService.publishComment(comment);
	}


}
