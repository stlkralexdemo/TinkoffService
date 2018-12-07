package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void calculateCashback() {
        CashbackService cashbackService = new CashbackService();
        int cashback = cashbackService.calculateCashback(4_000, 7_000, 23_753);
        assertEquals(892, cashback);
    }

    {
        CashbackService cashbackService = new CashbackService();
        int cashback = cashbackService.calculateCashback(4_000, 700_000, 23_753);
        assertEquals(3000, cashback);
    }
}