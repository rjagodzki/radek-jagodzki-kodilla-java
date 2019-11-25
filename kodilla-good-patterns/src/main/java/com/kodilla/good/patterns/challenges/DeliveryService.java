package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface DeliveryService {
    User user();
    LocalDateTime delivered();
}
