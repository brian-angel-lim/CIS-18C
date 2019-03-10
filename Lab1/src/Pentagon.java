public class Pentagon extends Quadrilateral  {
    public Pentagon(){
        sides = 5;
        sideLength = new double[sides];
    }

    //Assumes object is an equal pentagon
    @Override
    public double area(double sideLength[]) {
        double x = sideLength[1] * Math.sqrt(3); //apothem
        double p = perimeter(sideLength);

        return 0.5 * x * p;
    }
}
