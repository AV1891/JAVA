import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
   //System.out.print("What is your name  ");
    
//takes input from keyboard
    //String name = input.nextLine();    
//print the name
    //System.out.println("My name is " + name);
    //closes the scanner
    //input.close();
    System.out.print("Enter two numbers  ");
    double num1 = input.nextInt();
    double num2 = input.nextInt();
    System.out.println("Number is " + (num1+num2));
    input.close();

   }
  }
   
