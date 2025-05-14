class Computer {
    public int add(int a, int b) {
        return a + b;
    }

    public int add2numbers(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class Method {
    public static void main(Strings[] args) {
        Computer calc = new Computer();
        int r1 = calc.add(3, 4);
        int r2 = calc.add2numbers(3, 4, 5);
        System.out.println(r1);
        System.out.println(r2);

    }
}
