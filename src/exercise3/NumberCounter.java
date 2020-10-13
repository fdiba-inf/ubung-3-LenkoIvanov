package exercise3;

import java.util.Scanner;

public class NumberCounter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int positivecounter = 0;
    int negativecounter = 0;
    double sum = 0;
    double average = 0;

    int number = input.nextInt();

    while(number != 0 ){
      if(number > 0){
        positivecounter++;
      }else{
        negativecounter++;
      }
      sum += number;
      average += number;
      number=input.nextInt();
    }

    System.out.println("Positive numbers: " + positivecounter);
    System.out.println("Negative numbers: " + negativecounter);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + (average/2.0));
  }
}