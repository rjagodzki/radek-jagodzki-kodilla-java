package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.Mockito;

import java.util.ArrayList;

public class CalculateStatisticsTestSuite {
    private static int testCounter = 1;

    @Before
    public void beforeSingleTest(){
        System.out.println("\nTest #" + testCounter + " has began");
    }

    @After
    public void afterSingleTest(){
        System.out.println("Test #" + testCounter + " has ended");
        testCounter++;
    }

    @BeforeClass
    public static void beforeTests(){
        System.out.println("Tests began");
    }

    @AfterClass
    public static void afterTests(){
        System.out.println("Tests ended");
    }

    @Test
    public void testCalculateAdvStatisticWhenPostsQuantityEquals0(){
        System.out.println("Test: Posts Quantity Equals 0");
        //Given
        Statistics statistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for(int i = 0 ; i < 5; i ++)
        {
            userList.add(i,"User "+i);
        }

        //When
        Mockito.when(statistics.commentsCount()).thenReturn(50);
        Mockito.when(statistics.postsCount()).thenReturn(0);
        Mockito.when(statistics.userNames()).thenReturn(userList);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statistics);
        calculateStatistics.calculateAdvStatistics(statistics);
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(0,statistics.postsCount());
    }

    @Test
    public void testCalculateAdvStatisticWhenPostsQuantityEquals1000() {
        System.out.println("Test: Posts Quantity Equals 1000");
        //Given
        Statistics statistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for(int i = 0 ; i < 5; i ++)
        {
            userList.add(i,"User "+i);
        }

        //When
        Mockito.when(statistics.commentsCount()).thenReturn(50);
        Mockito.when(statistics.postsCount()).thenReturn(1000);
        Mockito.when(statistics.userNames()).thenReturn(userList);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statistics);
        calculateStatistics.calculateAdvStatistics(statistics);
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(1000,statistics.postsCount());
    }
    @Test
    public void testCalculateAdvStatisticWhenCommentsQuantityEquals0() {
        System.out.println("Test: Comments Quantity Equals 0");
        //Given
        Statistics statistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for(int i = 0 ; i < 5; i ++)
        {
            userList.add(i,"User "+i);
        }

        //When
        Mockito.when(statistics.commentsCount()).thenReturn(0);
        Mockito.when(statistics.postsCount()).thenReturn(100);
        Mockito.when(statistics.userNames()).thenReturn(userList);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statistics);
        calculateStatistics.calculateAdvStatistics(statistics);
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(0,statistics.commentsCount());
    }

    @Test
    public void testCalculateAdvStatisticWhenCommentsQuantityIsSmallerThanPostsQuantity() {
        System.out.println("Test: Comments Quantity is Smaller Than Posts Quantity");
        //Given
        Statistics statistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for(int i = 0 ; i < 5; i ++)
        {
            userList.add(i,"User "+i);
        }

        //When
        Mockito.when(statistics.commentsCount()).thenReturn(50);
        Mockito.when(statistics.postsCount()).thenReturn(100);
        Mockito.when(statistics.userNames()).thenReturn(userList);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statistics);
        calculateStatistics.calculateAdvStatistics(statistics);
        calculateStatistics.showStatistics();

        //Then
        Assert.assertTrue(statistics.commentsCount()<statistics.postsCount());
    }

    @Test
    public void testCalculateAdvStatisticWhenCommentsQuantityIsHigherThanPostsQuantity() {
        System.out.println("Test: Comments Quantity is Higher Than Posts Quantity");
        //Given
        Statistics statistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for(int i = 0 ; i < 5; i ++)
        {
            userList.add(i,"User "+i);
        }

        //When
        Mockito.when(statistics.commentsCount()).thenReturn(500);
        Mockito.when(statistics.postsCount()).thenReturn(10);
        Mockito.when(statistics.userNames()).thenReturn(userList);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statistics);
        calculateStatistics.calculateAdvStatistics(statistics);
        calculateStatistics.showStatistics();

        //Then

        Assert.assertTrue(statistics.commentsCount()>statistics.postsCount());
    }

    @Test
    public void testCalculateAdvStatisticWhenUsersQuantityEquals0() {
        System.out.println("Test: Users Quantity Equals 0");
        //Given
        Statistics statistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();

        //When
        Mockito.when(statistics.commentsCount()).thenReturn(50);
        Mockito.when(statistics.postsCount()).thenReturn(0);
        Mockito.when(statistics.userNames()).thenReturn(userList);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statistics);
        calculateStatistics.calculateAdvStatistics(statistics);
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(0,statistics.userNames().size());
    }
    @Test
    public void testCalculateAdvStatisticWhenUsersQuantityEquals100() {
        System.out.println("Test: Users Quantity Equals 100");
        //Given
        Statistics statistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for(int i = 0 ; i < 100; i ++)
        {
            userList.add(i,"User "+i);
        }

        //When
        Mockito.when(statistics.commentsCount()).thenReturn(50);
        Mockito.when(statistics.postsCount()).thenReturn(100);
        Mockito.when(statistics.userNames()).thenReturn(userList);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statistics);
        calculateStatistics.calculateAdvStatistics(statistics);
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(100,statistics.userNames().size());
    }
}
