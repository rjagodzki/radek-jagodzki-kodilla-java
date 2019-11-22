package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private UserInformation userInformation;
    private LocalDateTime when;

    public OrderRequest(UserInformation userInformation, LocalDateTime when) {
        this.userInformation = userInformation;
        this.when = when;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public LocalDateTime getWhen() {
        return when;
    }
}
