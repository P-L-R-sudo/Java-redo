public class Strings {
    public static void main (String[] args) {
    //     String name =" Lokesh ";
    //     name = name + "Reddy";
    //     System.out.println("hello" + name);
    // }

    StringBuffer sb = new StringBuffer("Lokesh");
    sb.append(" Reddy");
    sb.insert(6," Java");
    //sb.deleteCharAt(2);
    System.out.println(sb);
}
}

