//Subclass of Block
public class GrassBlock extends Block
{
    public GrassBlock(int x, int y, int z)
    {
        //Sets x, y, & z from block to x, y, z of GrassBlock
        super(true);//**study this; inherits "boolean y" from Block
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Exception errors indicate the type of error happening in a program. If we try to call b.draw, the exception would point
    //us to exactly where the error is. Good for debugging with incomplete projects
    @Override
    public void draw()
    {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void noise()
    {
        throw new UnsupportedOperationException("Not supported yet");
    }
}
