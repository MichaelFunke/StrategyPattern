import InteractionBehavior.TapScreenInteraction;

public class Smartphone extends Computer {

    void Smartphone() {
        userInteractionBehavior = new TapScreenInteraction();
    }

    @Override
    void powerOn() {
        System.out.println("Powering on");

    }

    @Override
    void powerOff() {
        System.out.println("Powering off");
    }
}
