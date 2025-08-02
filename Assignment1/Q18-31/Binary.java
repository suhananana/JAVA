public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int key = 7;
        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                found = true;
                System.out.println("Element found at index: " + mid);
                break;
            } else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (!found)
            System.out.println("Element not found.");
    }
}
