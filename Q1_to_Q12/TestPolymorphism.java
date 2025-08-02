public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Cat(); a.makeSound();
        a = new Cow(); a.makeSound();
    }
}
