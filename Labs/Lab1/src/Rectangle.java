public class Rectangle extends Quadrilateral {
    public Rectangle(){
        sides = 4;
        sideLength = new double[sides];
    }

    public Rectangle(int sides, double sideLength[]){
        this.sides = sides;
        this.sideLength = sideLength;
    }

    @Override
    public double area(double sideLength[]) {
        return sideLength[1] * sideLength[2];
    }
}
