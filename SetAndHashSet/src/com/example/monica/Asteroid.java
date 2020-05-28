package com.example.monica;

public class Asteroid extends HeavenlyBody{

    public Asteroid(String name, double orbitalPeriod) {
        super(name, BodyType.ASTEROID, orbitalPeriod);
    }
}
