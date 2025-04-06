public class Switchnew {
    public static void main (String arg []){

        String day = "Wed";
        String result = "";
        result = switch (day) {
            case "Sunday","Saturday" -> "8am" ;
            case "Monday" ->  "7am";
            default  -> "6am";
        };
            System.out.println(result);
    }
}
