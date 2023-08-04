package pizzashop;

public class PizzaCutter 
{
    private static PizzaCutter instance;
    private int numSlices;

    private PizzaCutter() {
        numSlices = 8; // Default number of slices to cut the pizza into
    }

    public static PizzaCutter getInstance() {
        if (instance == null) {
            instance = new PizzaCutter();
        }
        return instance;
    }

    public void setNumSlices(int numSlices) {
        this.numSlices = numSlices;
    }

    public int getNumSlices() {
        return numSlices;
    }

    public void cutPizza() {
        System.out.println("Cutting the pizza into " + numSlices + " slices.");
    }
}
