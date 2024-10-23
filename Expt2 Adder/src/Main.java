import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

class Adder{
    int targetSum;
    int[] arr ;

    public Adder(int arrSize){
        arr = new int[arrSize];
    }
    public void getData(int arrSize){
        System.out.println("Enter elements of array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arrSize ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum");
        targetSum = sc.nextInt();
        sc.close();
        System.out.println("Array is: "+ Arrays.toString(arr));
    }

    public int[] numSum(int arrSize){
        int[] arr1 = new int[0];
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0 ; i < arrSize ; i++){
            s.add(arr[i]);
            if(s.contains(targetSum-arr[i]) && targetSum-arr[i]!=arr[i]){
                arr1 = new int[]{ targetSum - arr[i] , arr[i]};
                return arr1;
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        int arrSize;
        Scanner sc = new Scanner(System.in);
        arrSize = sc.nextInt();

        Adder obj = new Adder(arrSize);
        obj.getData(arrSize);
        System.out.println("The target sum is: "+ obj.targetSum);
        System.out.println("The elements with the target sum "+obj.targetSum + " are: " + Arrays.toString(obj.numSum(arrSize)));
    }
}
