public class Square extends Quadrilateral {
    public Square(){
        sides = 4;
        sideLength = new double[sides];
    }

    public Square(int sides, double sideLength[]){
        this.sides = sides;
        this.sideLength = sideLength;
    }

    @Override
    public double perimeter(double sideLength[]) {
        return sideLength[1] * sideLength.length;
    }

    @Override
    public double area(double sideLength[]) {
        return sideLength[1] * sideLength[2];
    }
}
