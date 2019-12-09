import java.awt.*;
import java.util.Scanner;

public class MazeRunner {
       public static void main (String[] args){
        Maze myMap = new Maze();
        greeting(myMap);
        myMap = moveOffer(myMap);
    }

    public static void greeting(Maze myMap){
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current Position:");
        myMap.printMap();
    }
    public static Maze moveOffer(Maze myMap){

        // Move offering
        Scanner input = new Scanner(System.in);
        boolean chose = false;
        boolean gameOver = false;
        while (gameOver == false){
            System.out.print("Where would you like to move? (R L U D) ");

            String uChoice = input.nextLine();
            if(uChoice.equals("R")){
                boolean checkMove = myMap.canIMoveRight();
                if(checkMove){
                    System.out.println("Here is your current Position:");
                    myMap.moveRight();
                    myMap.printMap();
                    gameOver = myMap.didIWin();
                } else {
                    System.out.println("Sorry hit a wall");
                }

            }  else  if(uChoice.equals("L")){
                System.out.println(uChoice);
                gameOver = myMap.didIWin();
            } else  if(uChoice.equals("U")){
                System.out.println(uChoice);
                gameOver = myMap.didIWin();
            } else  if(uChoice.equals("D")){
                System.out.println(uChoice);
                gameOver = myMap.didIWin();
            }else {
                System.out.println("wrong choice");
            }
        }
            myMap.printMap();
            return myMap;
    }
}
