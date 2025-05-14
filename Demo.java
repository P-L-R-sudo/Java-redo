
class Mobile {
    String brand;
    static String color;
    int price;

    public void show() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Price: " + price);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + Mobile.color + " : " + obj.price);
    }
}

public class Demo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        Mobile.color = "Black"; // Static variable
        obj1.price = 40000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        Mobile.color = "Orange"; // static we called it using class name (i.e., Mobile ) .
        obj2.price = 50000;

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }
}
