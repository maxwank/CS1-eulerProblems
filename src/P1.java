public class P1 {
        public static void main(String[] args) {
            long sum = 0 ;
            for ( long i = 3 ; i < 1000 ; i+=3 ){
                sum+=i;
            }
            for ( long i = 5 ; i < 1000 ; i+=5 ){
                sum+=i;
            }
            for ( long i = 15 ; i < 1000 ; i+=15 ){
                sum-=i;
            }
            System.out.println("Answer: " + sum);
        }
}
