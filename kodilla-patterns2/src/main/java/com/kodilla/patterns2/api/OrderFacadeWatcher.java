package com.kodilla.patterns2.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderFacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.api.OrderFacade.processOrder(..))" +
            "&& target(object)")
    public void logEvent(Object object) {
        LOGGER.info("Class: " + object.getClass().getName());
    }

//    @After("execution(* com.kodilla.patterns2.api.OrderFacade.processOrder(..))" +
//            "&& target(object)")
//    public void afterEvent(Object object) throws NoSuchMethodException {
//        LOGGER.info("Method " + object.getClass().getMethod("processOrder") + " has finished");
//    }

    @AfterThrowing("execution(* com.kodilla.patterns2.api.OrderFacade.processOrder(..))")
    public void afterThrowingEvent() {
        LOGGER.error("Something went wrong!");
    }

    @Around("execution (* com.kodilla.patterns2.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }


}
