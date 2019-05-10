import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.HashMap;

public class Zoo {
    public static void main (String[] args) {
        HashMap<String,Animal> animalMap = new HashMap();
        Queue vetQueue = new LinkedList();
        Scanner scan = new Scanner(System.in);
        String animalName; //utilized in initializing elements in the collections
        int choice;

        do {
            System.out.println("Welcome to the San Diego Zoo Tracking system. Please select and option: ");
            System.out.println("1. Enter a new animal by name");
            System.out.println("2. Add an animal to the Veterinary Queue");
            System.out.println("3. Get the animal in the Veterinary Queue");
            System.out.println("4. Exit (optional)");
            System.out.print("What would you like to do: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter new animal name: ");
                    animalName = scan.nextLine();
                    Animal newAnimal = new Animal(animalName);
                    animalMap.put(animalName, newAnimal);
                    break;
                case 2:
                    System.out.print("Enter new animal name to add to queue: ");
                    animalName = scan.nextLine();
                    vetQueue.add(animalName);
                    break;
                case 3:
                    System.out.println("The next animal in the Veterinary Queue is " + vetQueue.remove());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        } while (choice != 4);
    }
}
