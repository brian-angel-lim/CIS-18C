public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(){
        sides = 3;
        sideLength = new double[sides];
    }

    public IsoscelesTriangle(int sides, double sideLength[]){
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double perimeter(double sideLength[]) {
        return sideLength[1] + (sideLength[2] * 2);
    }
}
