//Method Overriding & Use of super
class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        super.run();
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
