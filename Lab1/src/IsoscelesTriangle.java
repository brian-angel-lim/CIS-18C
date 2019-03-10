public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(int sides, double sideLength[]){
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double perimeter(double sideLength[]) {
        return sideLength[1] + (sideLength[2] * 2);
    }
}
