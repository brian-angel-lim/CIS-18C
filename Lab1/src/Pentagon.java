public class Pentagon extends Quadrilateral  {
    public Pentagon(){
        sides = 5;
        sideLength = new double[sides];
    }

    @Override
    public double perimeter(double sideLength[]) {
        double perimeter = 0;

        for(int i = 1; i <= 5; i++)
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
