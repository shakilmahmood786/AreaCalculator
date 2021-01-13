package com.company;

public class Main {

    public static void main(String[] args) {

        byte newByte = 50;
        short newShort = 1000;
        int newInt = 10000000;

        long longTotal = 50000L + 10 * (newByte + newShort + newInt);
        System.out.println(longTotal);



//        // Long has width of 64
//        long myLongValue = 9_223_372_036_854_775_807L;
//
//        // Int has width of 32
//        int myMinVale = -2_147_483_648;
//        int myMaxVale = 2_147_483_647;
//
//        // Short has width of 16
//        short myShortValue = -32768;
//
//        // Byte has width of 8
//        byte myByteValue = -128;
//        byte myNewByteValue = (byte) (myByteValue/2);
//        System.out.println("myNewByteValue = " + myNewByteValue);



    }
}
