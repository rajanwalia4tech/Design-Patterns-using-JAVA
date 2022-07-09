package DecoratorPattern;

public class Driver {

    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription() +", "+burger.getCost());

        burger = new ExtraMayoBurger(burger); // runtime polymorphism
        System.out.println(burger.getDescription() +", "+burger.getCost());

        burger = new ExtraCheeseBurger(burger); // runtime polymorphism
        System.out.println(burger.getDescription() +", "+burger.getCost());

    }
}
