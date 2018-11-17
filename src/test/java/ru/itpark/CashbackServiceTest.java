package ru.itpark;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @org.junit.jupiter.api.Test
    void calculateCashback() {
        CashbackService cashbackService = new CashbackService();
        int cashback = cashbackService.CalculateCashback(4_000, 7_000, 23_753);
        assertEquals(892, cashback);
    }

    {
        CashbackService cashbackService = new CashbackService();
        int cashback = cashbackService.CalculateCashback(4_000, 700_000, 23_753);
        assertEquals(3000, cashback);
    }
}