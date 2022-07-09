package DecoratorPattern;

public class ExtraMayoBurger extends BurgerDecorator{
    private Burger burger;

    public ExtraMayoBurger(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra Mayo";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 10.0; // plus 10 for extra cost of mayo
    }
}
