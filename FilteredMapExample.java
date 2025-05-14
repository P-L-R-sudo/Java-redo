import java.util.*;
import java.util.stream.*;

public class FilteredMapExample {
    public static void main(String[] args) {
        Map<String, Integer> itemQuantities = Map.of(
                "Apples", 50,
                "Oranges", 10,
                "Bananas", 5);

        // Filter items with quantity > 20
        Map<String, Integer> filtered = itemQuantities.entrySet().stream()
                .filter(entry -> entry.getValue() > 20)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filtered); // {Apples=50}
    }
}
