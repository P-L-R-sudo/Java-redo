class calc{
    public int add (int a, int b) {
        return a + b;
}
}
class Advcalc extends calc  {
    public int subtract (int a, int b) {
        return a - b ;
}
}
public class Overriding {
    public static void main(String[] args) {
        Advcalc obj = new Advcalc();
        System.out.println(obj.add(3, 4)); 
        System.out.println(obj.subtract(3, 4));
    }
}
