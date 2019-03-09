public class Octogon extends Quadrilateral  {
    public Octogon(){
        sides = 8;
        sideLength = new double[sides];
    }

    @Override
    public double perimeter(double sideLength[]) {
        double perimeter = 0;

        for(int i = 1; i <= 8; i++)
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
