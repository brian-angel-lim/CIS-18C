import java.util.Scanner;

public class CipherDriver {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String plainText = " ";
        String cipherText = " ";
        char choice = ' ';
        char again = ' ';
        int shift = 0;

        do {
            if(again == ' ') {
                System.out.println("Howdy! Welcome to the Encrypt-O-Mattic! " +
                        "Please enter your plain text: ");
                plainText = keyboard.next();
            }
            else
                System.out.println("Welcome back partner! " +
                        "Please enter your plain text: ");
                plainText = keyboard.next();

            System.out.println("Please enter how many values you wanna shift: ");
            shift = keyboard.nextInt();

            System.out.println("Please input your preferred cipher:");
            System.out.println("A. Caesar");
            System.out.println("B. Substitution");
            System.out.println("C. Random");
            choice = keyboard.next().charAt(0);
            choice = Character.toUpperCase(choice);

            switch (choice) {
                case 'A':
                    cipherText = encryptCaesar(plainText, shift);
                    break;
                case 'B':
                    cipherText = encryptSubstitution(plainText, shift);
                    break;
                case 'C':
                    cipherText = encryptRandom(plainText, shift);
                    break;
                default:
                    System.out.print("Invalid!");
            }

            System.out.println(cipherText);
            System.out.println("Do again?");
            again = keyboard.next().charAt(0);
            again = Character.toUpperCase(again);
        }while(again == 'Y');

    }

    public static String getInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input your plain text: ");
        return keyboard.next();
    }

    public static String encryptCaesar(String plainText, int shift){
        Caesar caesar = new Caesar(plainText, shift);
        return caesar.encrypt(plainText, shift);
    }

    public static String encryptSubstitution(String plainText, int shift){
        return "lol";
    }

    public static String encryptRandom(String plainText, int shift){
        return "lel";
    }

}
