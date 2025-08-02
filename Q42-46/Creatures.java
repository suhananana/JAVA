class Creatures {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
