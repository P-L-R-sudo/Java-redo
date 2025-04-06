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



