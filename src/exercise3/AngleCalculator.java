package exercise3;

import java.util.Scanner;

public class AngleCalculator{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double angle = input.nextDouble();
    char sym = input.next().charAt(0);

    do{
        if(sym == 'r'){
          double grad = angle * (180.00 / Math.PI);

          System.out.println("Angle: " + grad + "d");
          
        }else if(sym == 'd'){
          double radiant = angle * (Math.PI / 180.00);

          System.out.println("Angle: " + radiant + "r");
          
        }
        angle = input.nextDouble();
        sym = input.next().charAt(0);
    }while(sym == 'd' || sym == 'r');

    
  }
}