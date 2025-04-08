class A {
    public A (){
        System.out.println("A");
    }
    public A (int i) {
        super();
        System.out.println("int A ");
}
}
class B extends A {
    public B (){
        super(5);
        System.out.println("B");
    }
    public B (int i) {
        super(i);
                // parametarized constructor means giving a value
        System.out.println("int B");
}
}
public class Thissuper {
    public static void main (String[] args) {
        B obj = new B();
    }
}
