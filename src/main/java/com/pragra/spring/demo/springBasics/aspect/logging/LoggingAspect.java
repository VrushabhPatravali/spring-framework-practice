package com.pragra.spring.demo.springBasics.aspect.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.pragra.spring.demo.springBasics.aspect.data.*.*(..))") //logging before method execution(int[] com.pragra.spring.demo.springBasics.aspect.data.DataService.getData())
    public void logBeforeMethod(JoinPoint joinPoint) {
        logger.info("logging before method {}", joinPoint);
    }

    @After("execution(* com.pragra.spring.demo.springBasics.aspect.*.*(..))") //logging after method execution(void com.pragra.spring.demo.springBasics.aspect.BusinessApplication.run(String[]))
    public void logAfterMethod(JoinPoint joinPoint) {
        logger.info("logging after method {}", joinPoint);
    }
}
