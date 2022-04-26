public class SumOfEvenFibonaciNumbers {

    public static void main(String[] args) {
        System.out.println(fibonacciNumbers(4000000));
    }

    //Swap Method time complexity is O(N)
    public static int fibonacciNumbers(int n) {
        int sum=0;
        int num1=1;
        int num2=2;

        System.out.println(num1);
        System.out.println(num2);
        if(n>=2){
            sum+=num2;
        }
        int num3=0;


        while(num3<=n){
            num3=num1+num2;
            System.out.println(num3);
            if(num3%2==0){
                sum+=num3;
            }
            num1=num2;
            num2=num3;


        }

        return sum;
    }


}

