package com.goit.module2;

public class MoonRobotVespenGasDetector {
    public static void main(String[] args) {
        MoonRobotVespenGasDetector gasDetector = new MoonRobotVespenGasDetector();
        System.out.println("isAcidOk  " + gasDetector.isAcidOk(100, 50, 150));
        System.out.println("isDensityOk  " + gasDetector.isDensityOk(1500));
        System.out.println("isDensityOk  " + gasDetector.isDensityOk(3000));
        System.out.println("isTemperatureOk  " +gasDetector.isTemperatureOk(false));
        //System.out.println("isGroundOkForVespenGas  " +gasDetector.isGroundOkForVespenGas
           //    (120, 75, 150, 7500, false));
    }

    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        return acidValue >= minAcid && acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density) {
        //return  1000 < density <= 5000 || 10000 < density <= 15000;
        return  (density>1000  && density <= 5000)
                ||  ( density>10000 && density <= 15000);
    }
    public boolean isTemperatureOk(boolean cold){
return !cold ;
    }
    public boolean isGroundOkForVespenGas
            (int acidValue, int minAcid, int maxAcid, int density, boolean cold){
      return   isAcidOk(acidValue,minAcid, maxAcid) &&
        isDensityOk(density) &&
        isTemperatureOk(cold);
   }
}
