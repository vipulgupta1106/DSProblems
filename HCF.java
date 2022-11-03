public class HCF {
    public static void main(String[] args) {
        System.out.println(naive(100,780));
        System.out.println(iterative(100,780));
        System.out.println(recur(100,780));
    }

    private static int recur(int i, int j) {
        if(j == 0)
            return i;
        return recur(j, i%j);
    }

    private static int iterative(int a, int b) {
        while(a!=b){
            if(a>b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    private static int naive(int i, int j) {
        int min = Math.min(i,j);
        while(min > 0){
            if(i%min == 0 && j%min == 0)
                break;
            min--;
        }
        return min;
    }
    // Time complexity - O(min(a,b)


}
