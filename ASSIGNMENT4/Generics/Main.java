import java.util.*;

class MinMaxFinder<T extends Comparable<T>> {
    private List<T> list;

    MinMaxFinder(List<T> list) { this.list = list; }

    public T findMin() { return Collections.min(list); }
    public T findMax() { return Collections.max(list); }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 2, 8, 1);
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(nums);
        System.out.println("Min: " + intFinder.findMin() + ", Max: " + intFinder.findMax());

        List<String> words = Arrays.asList("Apple", "Mango", "Banana");
        MinMaxFinder<String> strFinder = new MinMaxFinder<>(words);
        System.out.println("Min: " + strFinder.findMin() + ", Max: " + strFinder.findMax());
    }
}
