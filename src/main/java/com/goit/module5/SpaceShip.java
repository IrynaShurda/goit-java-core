package com.goit.module5;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()|| name.length()>100){
            return;
        }
            this.name = name;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        if (!serialNumber.startsWith("SN") || serialNumber.length() !=8){
            return;
        }
        this.serialNumber = serialNumber;
    }



    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        //System.out.println(ship.getName()); //Should be null
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker
        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }

    public void printInfo (){
        SpaceRocketLauncher spaceRocketLauncher = new SpaceRocketLauncher();
        System.out.println("Name is " +  getName() +", serial number is " + getSerialNumber());
    }
}
