import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(3);
        nums.add(9);
        nums.add(2);

        System.out.println(nums); // now prints [6, 3, 9, 2]
    }
}
