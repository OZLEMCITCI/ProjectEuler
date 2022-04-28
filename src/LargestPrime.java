public class LargestPrime {

    public static void main(String[] args) {
        //System.out.println(largestPrime(600851475143L));

    }


    public static long largestPrime(long number){
        long largestPrime=1L;
        int i=2;
        while(i<=number){
            while(number%i==0){
                number/=i;
                    largestPrime=i;
            }
            i++;
        }
       return largestPrime;
    }


}
