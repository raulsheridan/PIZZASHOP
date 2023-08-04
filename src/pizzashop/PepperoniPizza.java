package pizzashop;
public class PepperoniPizza extends Pizza 
{
    public PepperoniPizza()
    {
        super();
        super.addTopping("cheese");
        super.addTopping("pepperoni");
    }
    
    public void bake(int temp)
    {
        super.bakeTemp = temp;
        System.out.println("Baking the pepperoni pizza at " + temp + " degrees Celsius for 15 minutes.");
    }
}
