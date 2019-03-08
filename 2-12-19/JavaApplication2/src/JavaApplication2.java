public class JavaApplication2 {
    public static void main(String[] args)
    {
        /*System.out.println("Hello World!!");

        //Primitive Data Types
        double x = 5;
        int y = 10;
        Integer otherY = 10;
        Integer z = y + otherY;
        String math = "5";
        Integer a = Integer.parseInt(math);

        //Objects are basically all pointers; they're reference type variables; Objects are also known as Abstract Data Types (ADT's)
        //john - "Everything in C++ can be written as a pointer. And it should be."
        //Objects/ADT's

        //"Block b" is just a reference to a memory location
        //"new Block" is a new instantiation put into Block b; Block() is a constructor function that creates it. It is the default constructor
        Block b = new Block();
        b.x = 5;
        b.y = 0;
        b.z = 0;
        b.breakBlock();

        Block c = new Block();
        c.x = 10;
        c.y = 22;
        c.z = 420;

        Block f;
        //System.out.println(f); - This is considered null, compiler wont allow f to print without being instantiated
        Block g = null;
        System.out.println(g);

        int n = 5;
        int m = 5;

        System.out.println("B = " + b.x + ", " + b.y + ", " + b.z);
        System.out.println("C = " + c.x + ", " + c.y + ", " + c.z);
        System.out.println("n + m = " + (n + m));
        System.out.println("Shape is " + Block.shape);*/
        GrassBlock b = new GrassBlock (1, 2, 3);
       try {
           b.noise();
       } catch (UnsupportedOperationException ex) {
           System.out.println("Someone's getting a bad grade");
       }

       //try & catch is a way for other developers to find errors in another dev's code
    }
}
