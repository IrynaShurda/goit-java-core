package com.goit.module5;

final class SpaceshipCalc {
    public static void main(String[] args) {
        SpaceshipCalc calc = new SpaceshipCalc();
        System.out.println(calc.calculateAirBalloons(35));
        System.out.println(calc.calculateBookCount(50));
    }
    final int calculateAirBalloons(int passengerCount){
        return passengerCount*10;
    }
    int calculateBookCount(int passengerCount){
        return passengerCount*2;
    }
}
