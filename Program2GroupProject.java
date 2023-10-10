import java.util.Scanner;
class Main {
  public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.print("Enter the grade:");
int n = input.nextInt();
    if(n>=80){
      System.out.println("More than 80%");
    }
      else if(n>=60){
        System.out.println("More than 60%");
      }
          else if(n>=40){
          System.out.println("Average");
        }
            else {
          System.out.println("Failed");
        }
      input.close();
  }
}
