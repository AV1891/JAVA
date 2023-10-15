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

        int largeNum = num1;

        if (num2 > largeNum) {
            largeNum = num2;
        }

        if (num3 > largeNum) {
            largeNum = num3;
        }

        System.out.println("The Largest number is: " + largeNum);

        scanner.close();
    }
}
