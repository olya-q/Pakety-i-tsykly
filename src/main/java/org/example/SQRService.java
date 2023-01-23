package org.example;

public class SQRService {
    public int calcSqr(int x, int y) {
        for (int i = 1; i < y; i++) {
            if (i * i < x) {
                continue;
            }
            if (i * i <= y) {
                return(i);
            }
        }
        return -1;
    }
}
