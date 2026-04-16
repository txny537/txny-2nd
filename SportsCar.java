public class SportsCar extends Vehicle implements Automobile {

    @Override
    public void accelerate() {
        System.out.println("SportsCar accelerating VERY fast!");
    }

    // OVERLOADING
    public void accelerate(int speed) {
        System.out.println("SportsCar zooming at " + speed + " km/h");
    }

    @Override
    public void stop() {
        System.out.println("SportsCar braking hard");
    }

    @Override
    public void gas() {
        System.out.println("SportsCar refueling premium fuel");
    }

    @Override
    public void openTrunk() {
        System.out.println("SportsCar small trunk opened");
    }

    @Override
    public void playMusic() {
        System.out.println("SportsCar playing loud music");
    }

    @Override
    public void displayInfo() {
        System.out.println("SportsCar Info:");
        System.out.println("Max Speed: " + MAX_SPEED);
        System.out.println("Doors: 2");
        System.out.println("Fuel Type: " + FUEL_TYPE);
    }
}