public abstract class Triangle implements Polygon  {
    public int sides = 3;
    public double[] sideLength = new double[sides];

    public abstract double area(double sideLength[]);

    public double perimeter(double sideLength[]) {
        double perimeter = 0;

        for(int i = 1; i <= sideLength.length; i++)
        {
            perimeter += sideLength[i];
            i++;
        }

        return perimeter;
    }

    protected double pythagorean(double sideLength[])
    {
        double a = sideLength[1];
        double b = sideLength[2];
        double c = Math.pow(sideLength[2],2) - Math.pow(sideLength[1],2);

        return Math.sqrt(c);
    }
}
