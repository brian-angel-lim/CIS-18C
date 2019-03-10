public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(int sides, double sideLength[]){
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double perimeter(double sideLength[]) {
        return sideLength[1] * sideLength.length;
    }

}
