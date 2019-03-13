import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        shapeMenu();
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

}
