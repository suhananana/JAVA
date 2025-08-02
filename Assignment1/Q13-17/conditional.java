public class conditional {
        public static void main(String[] args) {
            int number = 5;

            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }

            switch (number) {
                case 1:
                    System.out.println("Number is One");
                    break;
                case 5:
                    System.out.println("Number is Five");
                    break;
                default:
                    System.out.println("Unknown Number");
            }

            System.out.println("Numbers from 1 to 5:");
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");

        }
    }

}
