import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        int smallestNum = num1;

        if (num2 < smallestNum) {
            smallestNum = num2;
        }

        if (num3 < smallestNum) {
            smallestNum = num3;
        }

        System.out.println("The smallest number is: " + smallestNum);

        scanner.close();
    }
}
