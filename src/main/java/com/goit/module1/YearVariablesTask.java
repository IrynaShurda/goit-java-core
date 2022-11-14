package com.goit.module1;

class YearVariablesTask {
    public static void main(String[] args) {
        byte allMonthCountButNotWinter = 9;
        short february1996DayCount = 29;
        int halfOfTotalSpringDayCount = (31 + 31 + 30) / 2;
        long yearSecondCount = 365 * 24 * 60 * 60;
        float quarterOfMayDayCount = 31f / 4;
        double dayCountOfLongMonths = 217.0;
        char springLetter = 'r';
        boolean isLeap1900 = true;
        System.out.println(allMonthCountButNotWinter);
        System.out.println(february1996DayCount);
        System.out.println(halfOfTotalSpringDayCount);
        System.out.println(yearSecondCount);
        System.out.println(quarterOfMayDayCount);
        System.out.println(dayCountOfLongMonths);
        System.out.println(springLetter);
        System.out.println(isLeap1900);
        byte b = (byte) 150;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(127));
    }
}
