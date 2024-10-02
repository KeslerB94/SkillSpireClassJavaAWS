package Generics;

public class Main {
    public static void main(String[] args) {
        Inventory<Vehicle> inventory = new Inventory<>();

        Car car1 = new Car("","123456",200);
        Truck truck1 = new Truck("","654321",200);

        inventory.addToInventory(car1);
        inventory.addToInventory(truck1);

        System.out.println("Generics.Inventory size: " + inventory.getInventory().size());

        inventory.removeFromInventory("654321");
        System.out.println("Generics.Inventory size after removal: " + inventory.getInventory().size());
    }
        }




