public abstract class Triangle implements Polygon  {
    public int sides = 3;
    public double[] sideLength = new double[sides];

    protected double pythagorean(double sideLength[])
    {
        double a = sideLength[1];
        double b = sideLength[2];
        double c = Math.pow(sideLength[2],2) - Math.pow(sideLength[1],2);

        return Math.sqrt(c);
    }
    public double area(double sideLength[]) {
        double h = pythagorean(sideLength);

        return 0.5 * sideLength[1] * h;
    }
}
