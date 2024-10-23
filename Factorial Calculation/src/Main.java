import java.util.Arrays;

public class Main {
    static long[] arr = new long[51];
    static long recursiveFactorial(int n){
        if(arr[n]==-1) {
            arr[n] = recursiveFactorial(n - 1) * n;
        }
        return arr[n];
    }
    public static void main(String[] args) {
        Arrays.fill(arr,-1L);
        arr[0]=1;
        arr[1]=1;
        int n= 7;

        System.out.println("Factorial is: "+ recursiveFactorial(n));
        long ans =1L;
        for (long i =1 ; i<=n ; i++){
            ans*=i;
        }
        System.out.println("Iterative factorial is: "+ans);
        System.out.println(Arrays.toString(arr));
    }
}