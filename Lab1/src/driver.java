import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        shapeMenu();
        char choice = getChoice();
        switchShape(choice);
    }

    public static void shapeMenu()
    {
        System.out.println("Welcome to the Shape-O-Mattic! Please enter what shape you want to make: ");
        System.out.println("==========================================================================");
        //Quadrilaterals
        System.out.println("A. Square");
        System.out.println("B. Rectangle");
        System.out.println("C. Pentagon");
        System.out.println("D. Hexagon");
        System.out.println("E. Octagon");
        //Triangles
        System.out.println("F. Equilateral Triangle");
        System.out.println("B. Isosceles Triangle");
    }

    public static char getChoice(){
        Scanner keyboard = new Scanner(System.in);
        char choice = keyboard.next().charAt(0);

        return choice;
    }

    public static void switchShape(char choice){
        switch(choice) {
            case 1:
                makeSquare();
                break;
            case 2:
                makeRectangle();
                break;
            case 3:
                makePentagon();
                break;
            case 4:
                makeHexagon();
                break;
            case 5:
                makeOctagon();
                break;
            case 6:
                makeEquilateral();
                break;
            case 7:
                makeIsosceles();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static double makeSquare(){
        Square square = new Square();
        return 0;
    }


    public static double makeRectangle(){
        return 0;
    }


    public static double makePentagon(){
        return 0;
    }


    public static double makeHexagon(){
        return 0;
    }


    public static double makeOctagon(){
        return 0;
    }


    public static double makeEquilateral(){
        return 0;
    }


    public static double makeIsosceles(){
        return 0;
    }
}

