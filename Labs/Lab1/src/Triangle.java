public abstract class Triangle implements Polygon  {
    public int sides;
    public double[] sideLength;

    public Triangle() {
        sides = 3;
        sideLength = new double[sides];
    }

    public Triangle(int sides, double sideLength[]) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

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
