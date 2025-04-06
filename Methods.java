class computer{
    public void playmusic(){
        System.out.println("Playing music");
    }
    public String playvideo(int cost){
        if (cost >= 10){
            return "Playing video  " + cost;
        }else
            return "Nothing is free";
        }
    }

public class Methods {
    public static void main(String[] args) {
        computer obj = new computer();
        obj.playmusic();
        String str = obj.playvideo(10);
        System.out.println(str);
    }
}
