import java.awt.*;
import java.util.Scanner;

public class MazeRunner {
       public static void main (String[] args){
        Maze myMap = new Maze();
        greeting(myMap);
        myMap = moveOffer(myMap);
        System.out.println("Congratulations, you made it out alive");
    }

    public static void greeting(Maze myMap){
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current Position:");
        myMap.printMap();
    }

    public static Maze moveOffer(Maze myMap){
        int moves = 0;
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
                   navigatePit(myMap, "R");

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
                    navigatePit(myMap, "L");
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
                    navigatePit(myMap, "U");
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
                    navigatePit(myMap, "D");
                } else {
                    System.out.println("Sorry hit a wall");
                    myMap.printMap();
                }
            } else {
                System.out.println("wrong choice");
            }
            moves++;
            movesMessage(moves);
        }
            myMap.printMap();
            return myMap;
    }
    public static void movesMessage (int moves){
        if(moves == 50){
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        }

        if(moves == 75){
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");

        }

        if(moves == 90){
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        }

        if(moves == 100){
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
            System.out.println("Sorry, but you didn't escape in time - you lose!");
            System.exit(0);
        }
    }


    public static Maze navigatePit(Maze myMap, String dir){
           Scanner input = new Scanner (System.in);
           System.out.print("Watch out! There's a pit ahead Jump it? ");
           String jumping = input.nextLine();
           if(jumping.equals("YES")||jumping.equals("Y")){
               myMap.jumpOverPit(dir);
               myMap.printMap();
            } else{
               return myMap;
           }
           return myMap;
    }
}
