package com.example.monica;

public class Star extends HeavenlyBody{

    public Star(String name, double orbitalPeriod) {
        super(name, BodyType.STAR, orbitalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody planet) {
        if(planet.getKey().getBodyType() == BodyType.PLANET) {
            return super.addSatellite(planet);
        }
        else {
            System.out.println("Can only add body type = PLANET to STAR.");
            return false;
        }
    }
}
