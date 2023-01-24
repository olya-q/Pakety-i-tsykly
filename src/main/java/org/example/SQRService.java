package org.example;

public class SQRService {
    public int calcSqr(int min, int max) {
        int counter = 0;


        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= min) {
                if (iSquare <= max) {
                    counter++;
                }
            }
        }
        return counter;
    }
}