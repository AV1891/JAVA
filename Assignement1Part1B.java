import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Please enter a number: ");
        int Num1 = scanner.nextInt();
       System.out.print("Please enter a another number: ");
        int Num2 = scanner.nextInt();
      if (Num1 > Num2){
            System.out.println("Number 1 is greater than 2 ");
      }
       if (Num1 == Num2){
         System.out.println("Number 1 is equal  2 ");
      }
      else if(Num1<Num2)
        System.out.println("Number 2 is greater than  1");

    }
}
