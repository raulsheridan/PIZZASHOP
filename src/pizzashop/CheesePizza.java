package pizzashop;
public class CheesePizza extends Pizza
{
    public CheesePizza()
    {
        super();
        super.addTopping("cheese");
    }

    @Override
    public void bake(int temp)
    {
        super.bakeTemp = temp;
        System.out.println("Baking the cheese pizza at " + temp + " degrees Celsius for 10 minutes.");
    }
}
