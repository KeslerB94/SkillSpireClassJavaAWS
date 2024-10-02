package Generics;

abstract class Vehicle {
    String make;
    final String  model = "Ford";
    String vin;
    int horsepower;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Generics.Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }

    public Vehicle(String make, String vin, int horsepower) {
        this.make = make;
        this.vin = vin;
        this.horsepower = horsepower;



    }
}
