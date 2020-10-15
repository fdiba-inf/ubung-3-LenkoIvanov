package exercise3;

import java.util.Scanner;

public class Triangle{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    String type = "";

    do{
        if(a < c + b && b < a + c && c < a + b){
            if(a == c && b == c && a == b){
                type = "equilateral";
            }else if(a == c || b == c || a == b){
              type = "isosceles";
            }else{
              type = "scalene";
            }
            double s = (a + b + c)/2.0;
            double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

            System.out.println("Area: " + area);
            System.out.println("Triangle: " + type);

        }else{
          System.out.println("Values are not correct!")
        }

    }while(a > 0 && b > 0 && c > 0);
  }
}