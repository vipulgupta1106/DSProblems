public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursive(5));
    }

    private static int factorialRecursive(int i) {
        if(i<0)
            return -1;
        if (i == 0)
            return 1;
        return i*factorialRecursive(i-1);
    }

    private static int factorialIterative(int n){
        int res = 1;
        for(int i = 2; i<=n; i++){
            res = res * i;
        }
        return res;
    }

    // time complexity of both of the above methods is same O(n). Space complexity of iterative method is O(1). Space complexity of recursive solution is O(n) due to function call stack.
    // So Iterative solution is considered better.
}
