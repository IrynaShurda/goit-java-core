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
        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel

    }
        public String getFuelType(){
            return "A500";
        }
}
 class XFuelEngine extends Engine{
    @Override
     public String getFuelType(){
        return "XFuel";
    }
 }