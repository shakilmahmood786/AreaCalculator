package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes <= 0) || ((seconds <= 0) && (seconds >= 59)))
        {


            return INVALID_VALUE_MESSAGE;
        }


    int noOfHours = (minutes / 60);
    int remOfMins = (minutes % 60);
        return noOfHours + " Hours "+ remOfMins + " Minutes " + seconds + " Seconds";


}

    public static String getDurationString(int seconds) {

        if (seconds <= 0) {

            return INVALID_VALUE_MESSAGE;
        }

        int secToMin = (seconds / 60);
        int remSeconds = (seconds % 60);

        return getDurationString(secToMin, remSeconds);


    }
        }