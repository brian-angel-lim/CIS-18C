//Super Class
//Abstract - means it MUST have a child and cannot be created with just itself
//Example; If we write Block c = new Block(true, 51) in our driver, it will have an error
//Note - Cant extend to multiple superclasses; compiler will get cheesed
public abstract class Block implements audible, drawable
{
    public static String shape = "Square";
    public int x;
    public int y;
    public int z;
    public boolean n;

    public Block(boolean y)
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public void breakBlock()
    {
        //do something to break block
    }

    public abstract void draw(); //create an abstract class that doesn't require a method/instantiation, the sub class will decide this
    //also, any class that wants to inherit from block needs draw();


}
