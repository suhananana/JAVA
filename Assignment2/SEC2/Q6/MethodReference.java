interface Square{
    int calculate(int x);
}

public class MethodReference {
    public static int findSquare(int x){
        return x*x;
    }

    public static void main(String[] args){
        Square sq = MethodReference::findSquare;

        int num = 3;
        System.out.println("Square of " +  num + " is: " +sq.calculate(num));
    }
}
