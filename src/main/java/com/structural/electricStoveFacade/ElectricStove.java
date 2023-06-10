package com.structural.electricStoveFacade;

public class ElectricStove {
    Pot pot = new Pot();
    PowerRegulator powerRegulator = new PowerRegulator();
    PowerSupply powerSupply = new PowerSupply();
    public  void heatWater(){
        pot.pourTheWater();
        pot.putThePan();
        powerSupply.tornOn();
        powerRegulator.turnOnTheRegulator();
        pot.warmedUp();
        pot.removeThePot();
        powerRegulator.turnOffTheRegulator();
        powerSupply.tornOff();


    }
}
