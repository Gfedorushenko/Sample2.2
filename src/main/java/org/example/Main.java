package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("010101", "10001"));
        System.out.println(bins.mult("010101", "10001"));
    }
}