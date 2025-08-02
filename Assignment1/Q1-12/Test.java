public class Test {

    public static void main(String[] args) {
        Calculator c = new AdvancedCalculator();
        System.out.println("Int Add: " + c.add(5, 3));
        System.out.println("Double Add: " + c.add(5.5, 3.3));
    }
}
