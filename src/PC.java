import InteractionBehavior.ClickMouseInteraction;

public class PC extends Computer {

    void PC() {
        userInteractionBehavior = new ClickMouseInteraction();
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
