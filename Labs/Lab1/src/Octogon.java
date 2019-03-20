public class Octogon extends Quadrilateral  {
    public Octogon(){
        sides = 8;
        sideLength = new double[sides];
    }

    public Octogon(int sides, double sideLength[]){
        this.sides = sides;
        this.sideLength = sideLength;
    }

    @Override
    public double area(double sideLength[]) {
        return 2 * Math.pow(sideLength[1], 2) * (1+ Math.sqrt(2)); //note - this formula assumes that the shape is a regular octogon
    }
}
