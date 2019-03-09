public class Hexagon extends Quadrilateral  {
    public Hexagon(){
        sides = 6;
        sideLength = new double[sides];
    }

    @Override
    public double perimeter(double sideLength[]) {
        double perimeter = 0;

        for(int i = 1; i <= 6; i++)
        {
            perimeter += sideLength[i];
            i++;
        }

        return perimeter;
    }


    @Override
    public double area(double sideLength[]) {
        return 0;
    }
}
