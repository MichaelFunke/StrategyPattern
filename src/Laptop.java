import InteractionBehavior.TapTouchPadInteraction;

public class Laptop extends Computer {

    Laptop() {
        userInteractionBehavior = new TapTouchPadInteraction();
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
