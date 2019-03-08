public class PsuedoRandomDriver {
    public static void main (String[] args) {
        int a = 12;
        int b = 5;
        int n = 100;
        int cur = 92;
        int next = 0;

        next = (a * cur + b) % n;

        //For loop that gives the next 5 numbers after 92
        for(int i=cur; i<98;i++)
        {
            next = (a * i + b) % n;
            System.out.println(next);
        }

    }
}
