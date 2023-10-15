package data;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrink> products;

    public HotDrinkVendingMachine(){
        products = new ArrayList<HotDrink>();
    }

    public void addProduct(String name, int volume, int temperature){
        products.add(new HotDrink(name, volume, temperature));
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (int i = 0; i< products.size(); i++){
            HotDrink product = products.get(i);
            if (product.getName() == name && product.getVolume() == volume && product.getTemperature() == temperature){
                return product;
            }
        }
        return null;
    }


    public void initProducts(List<HotDrink> newList) {
        this.products = newList;
        System.out.println(newList);
    }


    public void printProducts(){
        for (int i = 0; i< products.size(); i++){
            System.out.println(products.get(i));
        }
    }

    public List getProducts(){
        return this.products;
    }

    @Override
    public String toString() {
        return "HotDrinkVendingMachine{" +
                "products=" + products +
                '}';
    }
}
