import java.util.*;

public class Listtoarraydemo {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue");

        // Typed version
        String[] typedArray = colors.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));

        // Raw Object version
        Object[] objectArray = colors.toArray();
        System.out.println("Object Array: " + Arrays.toString(objectArray));

        // Example of needing casting:
        String firstColor = (String) objectArray[0]; // need to cast
        System.out.println("First color (casted): " + firstColor);
    }
}
