public class Single {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

            System.out.println("s1 and s2 are the same object: " + (s1 == s2));
        }
}
