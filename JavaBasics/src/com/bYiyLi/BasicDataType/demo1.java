package com.bYiyLi.BasicDataType;

public class demo1 {
    private static void basicDataIsStack() {
        int a;
        int b;
        int c;
        int d;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basicDataIsStack();
    }

    public static void main(String[] args) {
        basicDataIsStack();

    }
}
