public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    int add(int a, int b) {
        System.out.println("Overridden method");
        return super.add(a, b);
    }
}
