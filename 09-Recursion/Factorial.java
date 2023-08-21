public class Factorial {

    long fact = 1;

    private long recursive(int n) {
        if( n == 1){
            return 1;
        }
        return n * recursive(n-1);
    }

    private void iterative(int n) {
        long fact = 1;
        while(n > 0){
            fact *= n;
            n -= 1;
        }
        System.out.println("Factorial with Interactive approach is " + fact);
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        fact.iterative(5);
        System.out.println("Factorial with Recursive approach is " + fact.recursive(5));

        fact.iterative(7);
        System.out.println("Factorial with Recursive approach is " + fact.recursive(7));
    }


}
