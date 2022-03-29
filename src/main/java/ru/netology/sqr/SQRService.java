package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowerBound, int upBound) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (lowerBound <= sqr && sqr <= upBound) {
                counter++;
            }
        }
        return counter;

    }

}
