package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {4,5,3,2,1,6,4,2,3,1,5,2,5,3,4,6,1,2,3,2};

        //When
        double expectedValue = 3.2;
        double realValue = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(expectedValue, realValue,0);

    }
}
