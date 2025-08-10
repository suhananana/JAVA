interface Calculator {
    int compute(int a, int b);
}
public class CalculatorLambda {
    public static void main(String[] args){
        Calculator add = (a,b) -> a+b;
        Calculator subtract = (a,b) -> a-b;
        Calculator multiply = (a,b) -> a*b;

        System.out.println("Addition: " + add.compute(10,20));
        System.out.println("Substraction: " + subtract.compute(5,2));
        System.out.println("Multiply: " + multiply.compute(9,2));

    }
}
