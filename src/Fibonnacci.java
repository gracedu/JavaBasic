public class Fibonnacci {
    public static int fib(int n) {
        if (n <= 1) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        long current = System.currentTimeMillis();
        int k=50;
        System.out.println(current);
        System.out.println("fib series:" + fib(k));
        Long millionSecs = (System.currentTimeMillis()-current);
        System.out.println("cacluating time for recursive without memory million seconds: "+millionSecs);
    }
}

