package com.example.monica;

// set has no defined order, can't have duplicates, can't retrieve a specific item
//

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        //Challenge test code:

        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Luna", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Jupiter", HeavenlyBody.BodyType.PLANET));
        System.out.println("Moons of " + body.getKey());
        for(HeavenlyBody moon : body.getSatellites()) {
            System.out.println("\t" + moon.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons: ");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getKey());
        }

        //case 3
        temp = new Planet("Uranus", 34567);
        planets.add(temp);

        //case 5 - new Asteroid - works
        //case 4 - new Planer - works (updates)
        HeavenlyBody uranus = new Planet("Uranus", 34567);
        planets.add(uranus);

        //case 1
        for(HeavenlyBody planet: planets) {
            System.out.println(planet);
 //           System.out.println(planet.getKey() + " : " + planet.getOrbitalPeriod());
        }

        //test case 2.

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);

        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        //case 6 test
        System.out.println();
        solarSystem.put(uranus.getKey(), uranus);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Uranus", HeavenlyBody.BodyType.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Uranus", HeavenlyBody.BodyType.ASTEROID)));

        System.out.println();
        System.out.println("Solar System contains:");
        for(HeavenlyBody hb : solarSystem.values()){
            System.out.println(hb);
        }
    }
}
