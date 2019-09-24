public class Hello {

    public static void main(String[] args){
        System.out.println("Hello World");
        fib(Long.MAX_VALUE / 2);
    }

    private static void fib(long max){
        fib_calc(0, 0, max);
    }

    private static void fib_calc(long a, long b, long max){
        long sum = a + b;
        if (sum > max) return;

        if (a == 0 
            && b == 0)
        {
            System.out.println("0");
            fib_calc(1, b, max);
        }
        else
        {
            System.out.println(sum);
            fib_calc(b, sum, max);
        }
    }  
}