public abstract class Triangle implements Polygon  {
    public int sides = 3;
    public int[] sideLength = new int[sides];

    public abstract double area();
    public abstract double perimeter();
}
