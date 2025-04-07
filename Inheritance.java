public class Inheritance {
    public static void main(String[] args){
        Advcal cal = new Advcal();
        int sum = cal.add(3, 3);
        int diff = cal.sub(7, 6);
        int multi = cal.multi(7, 6);
        int div = cal.div(7, 6);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + multi);
        System.out.println("Division: " + div);

    }
}

    

