public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle() {
        sides = 3;
        sideLength = new double[sides];
    }

    public EquilateralTriangle(int sides, double sideLength[]){
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double perimeter(double sideLength[]) {
        return sideLength[1] * sideLength.length;
    }

}
