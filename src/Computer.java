import InteractionBehavior.UserInteractionBehavior;

abstract class Computer {
    UserInteractionBehavior userInteractionBehavior;

//    private void setUserInteractionBehavior(UserInteractionBehavior ui) {
//        userInteractionBehavior = ui;
//    }

    public void performInteraction() {
        userInteractionBehavior.interactWithUser();
    }

    abstract void powerOn();

    abstract void powerOff();



}
