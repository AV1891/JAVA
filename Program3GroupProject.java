	import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double radius = input.nextDouble();
    double area;
    final double PI = 3.14;
    area = radius*radius*PI;
      if(radius<0){
        System.out.print("Negative input");
      }
    else if(radius>0){
      System.out.print("Area: " + area);
    }
  }
}
