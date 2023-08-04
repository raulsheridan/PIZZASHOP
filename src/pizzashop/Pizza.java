package pizzashop;

import java.util.ArrayList;

public class Pizza 
{
    int bakeTemp = 100;
    private ArrayList<String> ingredients = new ArrayList<>();

    public void bake(int temp) {
        bakeTemp = temp;
        System.out.println("Baking the pizza at " + temp + " degrees Celsius.");
    }

    public void addTopping(String topping) {
        ingredients.add(topping);
    }
}
