package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public UserInformation userInformation;
    public boolean isAvailable;

    public OrderDto(UserInformation userInformation, boolean isAvailable) {
        this.userInformation = userInformation;
        this.isAvailable = isAvailable;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
