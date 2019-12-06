package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsQuantityForUser;
    private double averageCommentsQuantityForUser;
    private double averageCommentsQuantityForPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.userNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostsQuantityForUser = (double)statistics.postsCount() / statistics.userNames().size();
        averageCommentsQuantityForUser = (double) statistics.commentsCount() / statistics.userNames().size();
        averageCommentsQuantityForPost = (double) statistics.commentsCount() / statistics.postsCount();
    }

    public void showStatistics() {
        System.out.println("Average Posts Quantity For User: " + averagePostsQuantityForUser);
        System.out.println("Average Comments Quantity For User: " + averageCommentsQuantityForUser);
        System.out.println("Average Comments Quantity For Post: " + averageCommentsQuantityForPost);
    }
}
