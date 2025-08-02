//Abstract Class & Method Overriding
abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

