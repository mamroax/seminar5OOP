package controller;

import data.HotDrink;
import data.HotDrinkVendingMachine;
import view.View;

import java.util.List;

public class Controller {
    private HotDrinkVendingMachine machine;
    private View view;

    public Controller(HotDrinkVendingMachine machine, View view){
        this.machine = machine;
        this.view = view;
    }

    public HotDrinkVendingMachine getMachine(){
        return machine;
    }

    public void createGroup(List<HotDrink> drinks){
        machine.initProducts(drinks);
    }

    public void createDrink(String name, int volume, int temperature){
        machine.addProduct(name, volume, temperature);
    }

    public void printInfo(){
        System.out.println(machine);
    }

    public void updateView(){
        view.printDetails(machine.getProducts());
    }

    @Override
    public String toString() {
        return "Controller{" +
                "machine=" + machine +
                '}';
    }
}
