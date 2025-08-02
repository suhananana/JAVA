public class Sum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 4};
        int sum = 0;

        for (int num : arr) sum += num;

        System.out.println("Sum of array elements: " + sum);
    }
}
