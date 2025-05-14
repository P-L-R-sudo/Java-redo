class laptop {
    String model;
    int price;
}

public class Hashcode {
    public static void main(String[] args) {
        laptop lp = new laptop();
        lp.model = "ASUS TUF GAMING ";
        lp.price = 60000;
        System.out.println(lp.toString());
    }

}
