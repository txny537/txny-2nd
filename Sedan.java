public class Sedan extends Vehicle implements Automobile {

    @Override
    public void accelerate() {
        System.out.println("Sedan accelerating smoothly");
    }

    // OVERLOADING
    public void accelerate(int speed) {
        System.out.println("Sedan accelerating at " + speed + " km/h");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopping");
    }

    @Override
    public void gas() {
        System.out.println("Sedan refueling");
    }

    @Override
    public void openTrunk() {
        System.out.println("Sedan trunk opened");
    }

    @Override
    public void playMusic() {
        System.out.println("Sedan playing music");
    }

    @Override
    public void displayInfo() {
        System.out.println("Sedan Info:");
        System.out.println("Max Speed: " + MAX_SPEED);
        System.out.println("Doors: " + NUMBER_OF_DOORS);
        System.out.println("Fuel Type: " + FUEL_TYPE);
    }
}