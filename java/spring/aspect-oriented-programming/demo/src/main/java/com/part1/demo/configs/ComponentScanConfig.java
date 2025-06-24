package com.part1.demo.configs;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com")
@EnableAspectJAutoProxy
public class ComponentScanConfig {

}
