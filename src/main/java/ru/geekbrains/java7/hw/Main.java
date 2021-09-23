package ru.geekbrains.java7.hw;

public class Main {
    public static void main(String[] args) {
        try {
            Tester.start(SomethingTest.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
