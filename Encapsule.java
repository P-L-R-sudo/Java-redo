class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsule {
    public static void main (String[] args) {
        Human hn = new Human();
         hn.setAge(30);
        hn.setName("loke");
         System.out.println(hn.getName() + ":" + hn.getAge());
}
}
