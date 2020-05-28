package com.example.monica;

import java.util.Set;

public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, BodyType.PLANET, orbitalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyType.MOON) {
            return super.addSatellite(moon);
        }
        else {
            System.out.println("Can only add body type = MOON to PLANET.");
            return false;
        }
    }
}
