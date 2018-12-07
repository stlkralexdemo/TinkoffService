package ru.itpark;

public class CashbackService {
    public int calculateCashback(int totalAmountOne, int totalAmountTwo, int totalAmountThree) {

        int percentOneCategory = 1;
        int percentTwoCategory = 2;
        int percentThreeCategory = 3;
        int maxCashback = 3000;

        int result = (totalAmountOne * percentOneCategory + totalAmountTwo * percentTwoCategory + totalAmountThree * percentThreeCategory) / 100;
        if (result > maxCashback) {
            result = maxCashback;
        }
        return result;
    }
}
