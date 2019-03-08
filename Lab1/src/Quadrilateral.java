public abstract class Quadrilateral implements Polygon {
    public int sides = 4;
    public int[] sideLength = new int[sides];

    public abstract double perimeter();
    public abstract double area();
}
