package Basics1;

public class methodchallenge {
    public static void main(String[] args) {
        int highscorepos = calculatehghscoreposition(1500);
        display("Ria",highscorepos);
    }
    public static void display(String name,int higherscorepos){
        System.out.println(name + " managed to get into position" + higherscorepos);
    }

    public static int calculatehghscoreposition(int playerscore) {
        if(playerscore>=1000){
            return 1;
        }
        else if(playerscore>=500 && playerscore<1000){
            return 2;
        }
        else{
            return 3;
        }

    }

}
