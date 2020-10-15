package exercise3;

import java.util.Scanner;

public class Triangle{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    String type = "";
    double s = (a + b + c)/2.0;
    double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
    

    do{
      if(a < b + c && b < a + c && c < a + b){
           if(a == b && b == c){
            type = "equilateral";
            System.out.println("Area: " + area);
            System.out.println("Triangle: " + type);
           }else if(a == b || b == c || a == c){
             type = "isosceles";
             System.out.println("Area: " + area);
             System.out.println("Triangle: " + type);
           }else if (a != b && b != c && a != c){
             type = "scalene";
             System.out.println("Area: " + area);
             System.out.println("Triangle: " + type);
           }
      }else{
        System.out.println("Values are not correct!");
      }

      a = input.nextDouble();
      b = input.nextDouble();
      c = input.nextDouble();

    }while(a > 0 && b > 0 && c > 0);
  }
}