package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ReceivingOrderService {
    User user();
    LocalDateTime received();
}
