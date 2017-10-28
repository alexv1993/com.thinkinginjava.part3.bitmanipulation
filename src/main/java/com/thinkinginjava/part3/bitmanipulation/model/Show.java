package com.thinkinginjava.part3.bitmanipulation.model;

/**
 * Created by Alex on 28.10.2017.
 */
public interface Show {
    static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ", binary: \n    " + Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + l + ", binary: \n    " + Long.toBinaryString(l));
    }
}
