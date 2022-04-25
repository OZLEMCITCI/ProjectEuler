public class MultiplesOfThreeOrFife {

    //time complexity is O(1)
    public static void main(String[] args) {
        System.out.println(multipleOf3Or5(1000));
    }
    public static int multipleOf3Or5 (int n){
        int num3=(n-1)/3;
        int sum_three=3*(num3*(num3+1)/2);
        int num5=(n-1)/5;
        int sum_five=5*(num5*(num5+1)/2);
        int num15=(n-1)/15;
        int sum_fifteen=15*(num15*(num15+1)/2);
        return sum_three-sum_fifteen+sum_five;
    }

}


