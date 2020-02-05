package com.bYiyLi.Other;

public class SaveOneself {
    static tem t;

    public static void main(String[] args) {
        t = new tem();
        t.name = "Hello";
        t = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.name);
        t = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.name);
    }

    static class tem {
        String name;

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            t = this;
        }
    }
}
