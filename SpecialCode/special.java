public class special {
	/** set true to enable debug */
	static boolean debug = false;

    public static void main(String[] args){
        // special.elderAge(8, 5, 1, 100);
		// special.elderAge(8, 8, 0, 100007);
		// special.elderAge(25, 31, 0, 100007);
		// special.elderAge(5, 45, 3, 1000007);
		// special.elderAge(31, 39, 7, 2345);
		// special.elderAge(545, 435, 342, 1000007);
        for(long k=1;k<=7;k++){
            
            System.out.println("For loss="+k);
            System.out.print("nm ");
            for(long j=1;j<=7;j++){
                System.out.print((j-1)+"  ");
            }
            System.out.println();
            
            for(long i=1; i<=7;i++){
                System.out.print((i-1)+"  ");
                for(long j=1;j<=7;j++){
                    System.out.print(special.pruteForce(i, j, k)+"  ");
                }
                System.out.println();
            }
        }
    }

    public static long pruteForce(long n,long m,long k){
        long element= (n-1)^(m-1);
        if(element - k >=0){
            return k;
        }
        return element;
    }

    public static long elderAge(long n, long m, long k, long newp) {
            
        long sum0, temp, t=newp,loss=k;
        // Where Loss = 0, t is infinite
        // Algorithm Starts Here
        if(n<m)
        {
          temp=m;
          m=n;
          n=temp;
        }
        m = m - 1;
        n = n - 1;
        String subBits,bits = Long.toBinaryString(m);
        long[] PerBit = new long[bits.length()];
        long count=0;
        sum0 = (n + 1) * (n) / 2;
        long TrueSum=sum0*(m+1);
        for (int i = 0; i < bits.length(); i++) {
            
            count=0;
            temp = (n % ((long) Math.pow(2, i + 1)));

            PerBit[i] = -1 * Math.abs(temp - (long) Math.pow(2, i) + 1) + (long) Math.pow(2, i);

            // System.out.println(((long) Math.pow(2, i)) + " => " + (sum0 + (PerBit[i] * (long) Math.pow(2, i))));
            try {
                subBits=bits.substring(bits.length()-i);
                count=count+Long.parseLong(subBits,2);  
                
            } catch (Exception e) {
                
            }
            try {
                subBits=bits.substring(0,bits.length()-i-1)+"0".repeat(i);
                count=count+Long.parseLong(subBits,2);
                
            } catch (Exception e) {
                
            }
            count=count + (long)Character.getNumericValue(bits.charAt(bits.length()-i-1));
            
            TrueSum+=  count*(PerBit[i] * (long) Math.pow(2, i));
        }
        
        m = m + 1;
        n = n + 1;

        //long loss1= loss*n*(m - (loss+1)/2);
        long loss2=loss*m*(n - (loss+1)/2);
        
        TrueSum=TrueSum - loss2;
            
        return TrueSum%t;
	}
}
