public class driver {
    public static void main(String[] args){
        FibonacciProgression fib = new FibonacciProgression(2, 2);

        for(int i = 0; i < 8; i++)
        {
            fib.advance();
            System.out.println(fib.current);
        }
    }
}
