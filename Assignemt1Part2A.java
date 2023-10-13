import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Where are you from? ");
            String place1 = scanner.nextLine();

            if (place1.equals("India")) {
              
                System.out.println("India is known for its diverse culture and delicious food.");
            } 
            else if (place1.equals("Canada")) {
                System.out.println("Canada is famous for Newtons Grove.");
            } 
            else if (place1.equals("America")) {
                System.out.println("The United States is one of the biggest countries in the world in size and peoplw.");
            } 
            else {
                System.out.println("I don't know anything about that place.");
            }
            scanner.close();
        }
    }
