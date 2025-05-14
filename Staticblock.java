class Mobile {
    String brand;
    static String color;
    int price;
    static String name;

    // ✅ Static block — inside the class
    static {
        name = "Mobile";
        System.out.println("This is static block");
    }

    // ✅ Constructor — also inside the class
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("This is constructor");
    }

    public void show() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Price: " + price);
    }
}

// ✅ Separate class with main method
public class Staticblock {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        Mobile.color = "Black"; // Static variable shared by all
        obj1.price = 40000;
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        Mobile.color = "Blue"; // Changed, affects all
        obj2.price = 50000;
        obj2.show();

        obj1.show(); // Will now also show "Blue"
    }
}
