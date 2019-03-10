public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(int sides, double sideLength[]){
        this.sides = sides;
        this.sideLength = sideLength;
    }

    @Override
    public double area(double sideLength[]) {
        double h = pythagorean(sideLength);

        return 0.5 * sideLength[1] * h;
    }
}
