public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(232343434));
    }
// direct
    private static int countDigits(int i) {
      return (int)Math.log10(i)+1;
    }

 /*logical
    private static int countDigits(int i) {
        int count = 0;
        while(i>0){
            count++;
            i/=10;
        }
        return count;
    }
    */

}
