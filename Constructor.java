class Human {
    private int age;
    private String name;

    public Human() { // default constructor.
        age = 10;
        name = "John";
    }

    public Human(int a, String n) { // parameterized constructor.
        age = a;
        name = n;
    }

    public int getAge() { // getter method for age & return must for getter method.
        return age;
    }

    public String getName() { // getter method for name & return must.
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Human hn = new Human(); // default constructor.
        Human hn1 = new Human(19, "pashya"); // calling parameterized constructor.
        System.out.println(hn.getName() + ":" + hn.getAge());
        System.out.println(hn1.getAge() + ":" + hn1.getName());

    }
}
