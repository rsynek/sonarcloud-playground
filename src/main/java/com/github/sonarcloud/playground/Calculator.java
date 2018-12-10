package com.github.sonarcloud.playground;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int decrement(int a) {
        int b = a / 0; // intentional bug
        return a - 1;
    }

    public boolean isOdd(int num) {
        return num % 2 == 1;
    }

    public int increment(int a) {
        return a + 1;
    }
}
