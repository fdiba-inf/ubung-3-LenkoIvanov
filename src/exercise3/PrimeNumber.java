package exercise3;

import java.util.Scanner;

public class PrimeNumber{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    boolean prime = true;
    int divider = 2;
    int maxDivider = (int) Math.sqrt(number);
    
    while(prime && divider <= maxDivider){
      if(number % divider == 0){
        prime = false;
      }
      
      divider++;

    }
     
     System.out.println("Prime number: " + prime);
  }
}