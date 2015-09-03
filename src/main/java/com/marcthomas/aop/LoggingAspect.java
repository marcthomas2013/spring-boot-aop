package com.marcthomas.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * This class implements the actual aspect that provides the method that will be invoked before the execution of the
 * supplied method.
 */
@Aspect
public class LoggingAspect {
    @Before("execution(* com.marcthomas.MyService.doSomething(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Log before run before: " + joinPoint.getSignature().getName());
    }
}
