import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your preferred language. e = English, f = French, p = Punjabi");
        char lang = scanner.next().charAt(0);

        if (lang == 'e') {
            System.out.println("How are you?");
        } else if (lang == 'f') {
            System.out.println("Comment ça va?");
        } else if (lang == 'p') {
            System.out.println("ਤੁਸੀਂ ਕਿਵੇਂ ਹੋ? ");
        } else {
            System.out.println("Sorry, I dont know your preferred language.");
        }
        scanner.close();
    }
}
