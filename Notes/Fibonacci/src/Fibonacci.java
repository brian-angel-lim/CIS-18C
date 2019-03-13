//in each value, it is a combination of the two previous values
//your in-function call could be fib(x,x+y)
public class Fibonacci {
    public static void main(String[] args) {
      //starting point will be 0 & 1
        fib(0, 1, 0);
    }

    //
    public static int fib(int x, int y, int count){
        if (y > 1000) {
            return y;
        } else {
        System.out.println(x);
        System.out.println(count + "\n");
        return fib(y, x+y, ++count);
        }
    }
}
