public class Hexagon extends Quadrilateral  {
    public Hexagon(){
        sides = 6;
        sideLength = new double[sides];
    }

    @Override
    public double area(double sideLength[]) {
        double x = sideLength[1] * Math.sqrt(3);
        double p = x * 2;

        return 0.5 * x * p;
    }
}
