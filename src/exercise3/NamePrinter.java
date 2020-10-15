package exercise3;

import java.util.Scanner;

public class NamePrinter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String word = input.next();

    for(int i = 0; i < word.length(); i++){
      System.out.println("* " + word.charAt(i) + " *");
    }
  }
}