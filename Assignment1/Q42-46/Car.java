//Final Classes and Methods
class Car {

    final void displayBrand() {
        System.out.println("Brand: Toyota");
    }
}

class SportsCar extends Car {

    void displayModel() {
        System.out.println("Model: Supra");
    }

    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.displayBrand();
        sc.displayModel();
    }
}
