package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User yGeneration = new YGeneration("Monica");
        User millenias = new Millenials("Rachel");
        User zGeneration = new ZGeneration("Pheobe");

        //When
        System.out.println(yGeneration.getUserName() + " " + yGeneration.sharePost());
        System.out.println(millenias.getUserName() + " " + millenias.sharePost());
        System.out.println(zGeneration.getUserName() + " " + zGeneration.sharePost());

        //Then
        Assert.assertEquals("Snapchat", yGeneration.sharePost());
        Assert.assertEquals("Facebook", millenias.sharePost());
        Assert.assertEquals("Twitter", zGeneration.sharePost());
    }

    @Test
    public void testIndividualSharingStrategies(){
        //Given
        User user = new YGeneration("Joey");

        //When
        user.setSocialPublisher(new TwitterPublisher());
        System.out.println(user.getUserName() + " " + user.sharePost());

        //Then
        Assert.assertEquals("Twitter", user.sharePost());
    }
}
