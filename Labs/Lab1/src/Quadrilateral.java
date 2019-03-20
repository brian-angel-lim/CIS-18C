public abstract class Quadrilateral implements Polygon {
    protected int sides;
    public double[] sideLength;

    public double perimeter(double sideLength[]) {
        double perimeter = 0;

        for(int i = 1; i <= sideLength.length; i++)
        {
            perimeter += sideLength[i];
            i++;
        }

        return perimeter;
    }
}
