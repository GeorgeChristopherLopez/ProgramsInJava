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
        Scanner input = new Scanner(System.in);
        // Move offering
            while (!myMap.didIWin()){

            System.out.print("Where would you like to move? (R L U D) ");

            String uChoice = input.nextLine();
            if(uChoice.equals("R")){
                if(myMap.canIMoveRight()){
                    System.out.println("Here is your current Position:");
                    myMap.moveRight();
                    myMap.printMap();
                } else if(myMap.isThereAPit("R")) {
                    myMap.jumpOverPit("R");
                    myMap.printMap();
                } else {
                    System.out.println("Sorry hit a wall");
                    myMap.printMap();
                }
            }  else  if(uChoice.equals("L")){
                if(myMap.canIMoveLeft()){
                    System.out.println("Here is your current Position:");
                    myMap.moveLeft();
                    myMap.printMap();
                }  else if(myMap.isThereAPit("L")) {
                    myMap.jumpOverPit("L");
                    myMap.printMap();
                } else {
                    System.out.println("Sorry hit a wall");
                    myMap.printMap();
                }
            } else  if(uChoice.equals("U")){
                if(myMap.canIMoveUp()){
                    System.out.println("Here is your current Position:");
                    myMap.moveUp();
                    myMap.printMap();
                }  else if(myMap.isThereAPit("U")) {
                    myMap.jumpOverPit("U");
                    myMap.printMap();
                } else {
                    System.out.println("Sorry hit a wall");
                    myMap.printMap();
                }
            } else  if(uChoice.equals("D")){
                if(myMap.canIMoveDown()){
                    System.out.println("Here is your current Position:");
                    myMap.moveDown();
                    myMap.printMap();
                }  else if(myMap.isThereAPit("D")) {
                    myMap.jumpOverPit("D");
                    myMap.printMap();
                } else {
                    System.out.println("Sorry hit a wall");
                    myMap.printMap();
                }
            } else {
                System.out.println("wrong choice");
            }
        }
            myMap.printMap();
            return myMap;
    }
}
