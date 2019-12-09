package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog(){
        //Given
        Logger.getLoggerInstance().log("log1");

        //When
        String result = Logger.getLoggerInstance().getLastLog();

        //Then
        Assert.assertEquals("log1", result);
    }
}
