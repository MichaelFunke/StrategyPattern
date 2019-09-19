

public class StrategyPattern {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.powerOn();
        laptop.performInteraction();
        laptop.powerOff();
    }

}
