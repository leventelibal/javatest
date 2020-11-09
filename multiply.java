public class multiply {

    public static void main(String [] argsStrings) {
        
    }

        public int sum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
            System.out.println (sum);
            return sum;
        
    }
    
}
