public interface Polygon {
    public int sides = 0;
    public int[] sideLength = new int[sides];
    public  double area = 0;
    public double perimeter = 0;

    public abstract double perimeter(int sides, int sideLength);
    public abstract double area(int sides, int sideLength);
}
