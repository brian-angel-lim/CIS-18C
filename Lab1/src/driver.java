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

    public static void makeSquare(){
        Scanner keyboard = new Scanner(System.in);
        Square square = new Square();
        double perimeter = 0.0;
        double area = 0.0;

        for (int i=1; i<= square.sideLength.length; i++) {
            System.out.println("Please enter the length of side " + square.sideLength[i]);
            square.sideLength[i] = keyboard.nextDouble();
        }

        perimeter = square.perimeter(square.sideLength);
        area = square.area(square.sideLength);

        System.out.println("Your square has an perimeter of " + perimeter + ".");
        System.out.println("Your square has an area of " + area + ".");
    }


    public static void makeRectangle(){
        Scanner keyboard = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        double perimeter = 0.0;
        double area = 0.0;

        for (int i=1; i<= rectangle.sideLength.length; i++) {
            System.out.println("Please enter the length of side " + rectangle.sideLength[i]);
            rectangle.sideLength[i] = keyboard.nextDouble();
        }

        perimeter = rectangle.perimeter(rectangle.sideLength);
        area = rectangle.area(rectangle.sideLength);

        System.out.println("Your rectangle has an perimeter of " + perimeter + ".");
        System.out.println("Your rectangle has an area of " + area + ".");
    }


    public static void makePentagon(){Scanner keyboard = new Scanner(System.in);
        Pentagon pentagon = new Pentagon();
        double perimeter = 0.0;
        double area = 0.0;

        for (int i=1; i<= pentagon.sideLength.length; i++) {
            System.out.println("Please enter the length of side " + pentagon.sideLength[i]);
            pentagon.sideLength[i] = keyboard.nextDouble();
        }

        perimeter = pentagon.perimeter(pentagon.sideLength);
        area = pentagon.area(pentagon.sideLength);

        System.out.println("Your pentagon has an perimeter of " + perimeter + ".");
        System.out.println("Your pentagon has an area of " + area + ".");
    }


    public static void makeHexagon(){
        Scanner keyboard = new Scanner(System.in);
        Hexagon hexagon = new Hexagon();
        double perimeter = 0.0;
        double area = 0.0;

        for (int i=1; i<= hexagon.sideLength.length; i++) {
            System.out.println("Please enter the length of side " + hexagon.sideLength[i]);
            hexagon.sideLength[i] = keyboard.nextDouble();
        }

        perimeter = hexagon.perimeter(hexagon.sideLength);
        area = hexagon.area(hexagon.sideLength);

        System.out.println("Your hexagon has an perimeter of " + perimeter + ".");
        System.out.println("Your hexagon has an area of " + area + ".");
    }


    public static void makeOctagon(){
        Scanner keyboard = new Scanner(System.in);
        Octogon octagon = new Octogon();
        double perimeter = 0.0;
        double area = 0.0;

        for (int i=1; i<= octagon.sideLength.length; i++) {
            System.out.println("Please enter the length of side " + octagon.sideLength[i]);
            octagon.sideLength[i] = keyboard.nextDouble();
        }

        perimeter = octagon.perimeter(octagon.sideLength);
        area = octagon.area(octagon.sideLength);

        System.out.println("Your octagon has an perimeter of " + perimeter + ".");
        System.out.println("Your octagon has an area of " + area + ".");
    }


    public static void makeEquilateral(){
        Scanner keyboard = new Scanner(System.in);
        EquilateralTriangle equilateral = new EquilateralTriangle();
        double perimeter = 0.0;
        double area = 0.0;

        for (int i=1; i<= equilateral.sideLength.length; i++) {
            System.out.println("Please enter the length of side " + equilateral.sideLength[i]);
            equilateral.sideLength[i] = keyboard.nextDouble();
        }

        perimeter = equilateral.perimeter(equilateral.sideLength);
        area = equilateral.area(equilateral.sideLength);

        System.out.println("Your equilateral has an perimeter of " + perimeter + ".");
        System.out.println("Your equilateral has an area of " + area + ".");
    }


    public static void makeIsosceles(){
        Scanner keyboard = new Scanner(System.in);
        IsoscelesTriangle isosceles = new IsoscelesTriangle();
        double perimeter = 0.0;
        double area = 0.0;

        for (int i=1; i<= 2; i++) {
            System.out.println("Please enter the length of side " + isosceles.sideLength[i]);
            isosceles.sideLength[i] = keyboard.nextDouble();
        }

        perimeter = isosceles.perimeter(isosceles.sideLength);
        area = isosceles.area(isosceles.sideLength);

        System.out.println("Your isosceles has an perimeter of " + perimeter + ".");
        System.out.println("Your isosceles has an area of " + area + ".");
    }
}

