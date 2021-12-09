package ru.netology.app;

public class SQRService {
    public int sqrtValueInRange(int minLevel, int maxLevel) {
        int i;
        int result = 0;
        for (i = 10; i <= 99; i++) {
            if ((i*i) >= minLevel && (i*i) <= maxLevel) {
                result++;
            }
        }
        return (result);
    }

}
