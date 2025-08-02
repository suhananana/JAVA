public class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Moo");
    }
}

