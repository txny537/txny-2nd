public class Main {
    public static void main(String[] args) {

        // POLYMORPHISM
        Vehicle v1 = new Sedan();
        Vehicle v2 = new SportsCar();

        v1.accelerate();
        v2.accelerate();

        System.out.println("------------");

        // FULL OBJECT
        Sedan sedan = new Sedan();
        sedan.accelerate(120);
        sedan.displayInfo();

        System.out.println("------------");

        SportsCar car = new SportsCar();
        car.accelerate(200);
        car.displayInfo();
    }
}