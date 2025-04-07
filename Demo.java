<<<<<<< HEAD
class Mobile{
    String brand;
    static String color;
    int price;

    public void show(){
        System.out.println("Brand: " + brand + ", Color: " + color + ", Price: " + price);
    }
    public static void show1(Mobile obj){
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
        Mobile.color = "Orange"; //static we called it using class name (i.e., Mobile ) .
        obj2.price = 50000;

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }

    
}
=======
class Mobile {
    String model;
    static String color ;
    static int price ;

    public void show() {
        System.out.println( model + ", Color: " + color + ", Price: " + price);
    }
} // WE HAVE TO END CLASS HERE BCAUSE WE HAVE TO MAKE 2 CLASSSES SEPARATE .
    public class Demo{
    public static void main(String[] args) {
        Mobile mb1 = new Mobile();
        mb1.model = "Samsung";
        Mobile.color = "Black"; // USE MOBILE NOT MB1 OR MB2 WHEN IT IS STATIC REMEMBER 
        Mobile.price = 50000; // USEING CLASS NAME AS MOBIE NOT OBJECT NAME AS MB1 OR MB2. 
        mb1.show();

        Mobile mb2 = new Mobile();
        mb2.model = "Apple";
        Mobile.color = "Blue";
        Mobile.price = 70000;
        mb1.show();
        mb2.show();

    }
}



>>>>>>> d65416a545b7f326aa67c4858157a50010f53cb1
