import java.awt.*;
import java.util.Scanner;

public class MazeRunner {
 public static void main (String[] args){
     Maze myMap = new Maze();
     // Greeting
     System.out.println("Welcome to Maze Runner!");
     System.out.println("Here is your current Position:");
     myMap.printMap();
     // Move offering
  Scanner input = new Scanner(System.in);
     boolean chose = false;
     while (chose == false){
       System.out.print("Where would you like to move? (R L U D) ");
       String uChoice = input.nextLine();
       if(uChoice.equals("R")){
        boolean check = myMap.canIMoveRight();
        if(check){
         System.out.println("Here is your current Position:");
         myMap.printMap();
         chose = true;
        } else {
         System.out.println("Sorry hit a wall");
        }

       }  else  if(uChoice.equals("L")){
        System.out.println(uChoice);
        chose = true;
       } else  if(uChoice.equals("U")){
        System.out.println(uChoice);
        chose = true;
       } else  if(uChoice.equals("D")){
        System.out.println(uChoice);
        chose = true;
       }else {
        System.out.println("wrong choice");
       }
     }

 }
}
