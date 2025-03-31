package com.darshana.assignment_01;

public class Superman implements Hero{
    String powerLevel;
    int experience;

    public Superman(String powerLevel, int experience) {
        this.powerLevel = powerLevel;
        this.experience = experience;
    }

    @Override
    public void action() {
        System.out.println("Superman with power level " + this.powerLevel + " and " + this.experience + " years of experience is flying!" );
    }
}
