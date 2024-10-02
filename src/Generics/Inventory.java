package Generics;

import java.util.ArrayList;
import java.util.Iterator;

class Inventory<T extends Vehicle> {
    private ArrayList<T> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
    }

    public ArrayList<T> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<T> inventory) {
        this.inventory = inventory;
    }

    public void addToInventory(T vehicle) {
        inventory.add(vehicle);
    }

    public boolean removeFromInventory(String vin) {
        Iterator<T> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            T vehicle = iterator.next();
            if (vehicle.getVin().equals(vin)) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}