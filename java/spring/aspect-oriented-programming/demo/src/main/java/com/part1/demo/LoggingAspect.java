package com.part1.demo;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {


    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.part1.demo.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("start");
        joinPoint.proceed();
        logger.info("end");

    }

}