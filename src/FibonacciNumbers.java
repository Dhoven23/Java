public class FibonacciNumbers {

    public static void main(String[] args){
        System.out.println(Long.MAX_VALUE);
        long x = 1L;
        long y = 0L;

        Fibber(x, y);
        random_new_method();
    }

    private static void Fibber(long x, long y) {
        long z;
        do{
            z = x + y;
            x = y;
            y = z;
            System.out.println(z);

        } while(z<(2L<<61));
    }
    public static void random_new_method(){
        System.out.println("Congratulations, you have broken out of the matrix");
    }
}

