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
    public double perimeter(double sideLength[]) {
        double perimeter = 0;

        for(int i = 1; i <= 4; i++)
        {
            perimeter += sideLength[i];
            i++;
        }

        return perimeter;
    }

    @Override
    public double area(double sideLength[]) {
        return sideLength[1] * sideLength[2];
    }
}
