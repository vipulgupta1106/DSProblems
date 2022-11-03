public class CountTrailingZeroesInFactorial{
    public static void main(String[] args) {
        System.out.println(naiveMethod(5));
        System.out.println(better(10));
    }

    private static int naiveMethod(int n) {
        int fact = 1;
        for(int i = 2; i<=n; i++)
            fact = fact * i;
        int count = 0;
        while(fact%10 == 0){
            count++;
            fact/=10;
        }
        return count;
    }
    // Time complexity = O(n); issue with this approach is higher value of n will give very big value of fact. This can cause overflow error.

    private static int better(int n){
        int count = 0;
        for(int i = 5; i <=n; i=i*5){
            count = count + n/i;
        }
        return count;
    }// Time complexity - O(log n)
}