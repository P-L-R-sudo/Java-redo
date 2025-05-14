import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(40, 10, 20, 30);
        Collections.sort(scores);
        System.out.println(scores); // [10, 20, 30, 40]
    }
}
