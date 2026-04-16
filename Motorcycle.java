public class Motorcycle extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Motorcycle speeding up");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopping");
    }

    @Override
    public void gas() {
        System.out.println("Motorcycle refueling");
    }
}