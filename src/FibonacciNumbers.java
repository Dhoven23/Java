public class FibonacciNumbers {

    public static void main(String[] args){
        System.out.println(Long.MAX_VALUE);
        long x = 1L;
        long y = 0L;

        Fibber(x, y);
        randomnewmethod();
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
    public static void randomnewmethod(){
        System.out.println("random method added");
    }
}

