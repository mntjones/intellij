package academy.learnprogramming;

import java.util.ArrayList;

public class Gearbox {
// outer class
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i=0; i < maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number >= 0 && (number < maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear (int newGear) {
        if (newGear >= 0 && (newGear < this.gears.size() && this.clutchIsIn)) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }
        else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(this.clutchIsIn) {
            System.out.println("Scream!");
            return 0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    // Non-Static class example - referring to a gear only makes sense in the context of a gearbox
    // private means that Gear class is not available outside of the Gearbox class
    // Gear does have access to all methods and variables in Gearbox, even those marked private

    private class Gear {
        private int gearNumber;
        private double ratio;

        // this refers to inner class

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }


}
