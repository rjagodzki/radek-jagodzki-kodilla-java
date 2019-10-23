package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    public final int userID;
    public final String userName;
    public final char sex;
    public final LocalDate birth;
    public final int numberOfPosts;

    public ForumUser(int userID, String userName, char sex, LocalDate birth, int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birth = birth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                '}';
    }
}
