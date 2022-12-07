public class P14 {
        public static void main(String[] args) {
        System.out.println("\f");
        double startTime=System.nanoTime();
        int max=0;
        int thing=0;
        for (int i=2;i<1000000;i++) {
            long n=i;
            int count=0;
            while(n>1) {
                count++;
                if(n%2==0) {
                    n=n/2;
                }
                else    {
                    n=3*n+1;
                }
            }
            if(max<count) {
                max=count;
                thing=i;
            }
        }
        double endTime=System.nanoTime();
        System.out.println(thing+" "+max+" "+(endTime-startTime)/1000000+" ms");
        }
}

