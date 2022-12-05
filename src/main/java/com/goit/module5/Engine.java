package com.goit.module5;

public class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public static void main(String[] args) {
        System.out.println(new Engine().getFuelType());

    }
        public String getFuelType(){
            return "A500";
        }
}
