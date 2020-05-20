package academy.learnprogramming;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setModel (String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("prius c")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }

    public String getModel () {
        return this.model;
    }


}
