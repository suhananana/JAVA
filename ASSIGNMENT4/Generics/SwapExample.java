public class SwapExample {
    public static <T> void swapElements(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        swapElements(nums, 0, 2);
        for (int n : nums) System.out.print(n + " ");
    }
}
