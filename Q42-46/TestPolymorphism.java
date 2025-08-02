public class TestPolymorphism {

    public static void main(String[] args) {
        Animal a;

        a = new Cat();
        ((Cat) a).sound();

        a = new dog();
        ((dog) a).sound();
    }
}
