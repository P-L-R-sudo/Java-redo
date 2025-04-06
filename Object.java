


class calculator 
{
    public int add (int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}
public class Object {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5234567;
        calculator calc = new calculator();
        System.out.println(calc.add(num1, num2)); 
    }
}