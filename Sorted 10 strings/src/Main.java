import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sortedArr = new String[10];
        String[] sortedString = new String[10];

        for (int i = 0 ; i < 10 ; i++){
            sortedArr[i]= sc.nextLine();
            char[] tempArr = sortedArr[i].toCharArray();
            Arrays.sort(tempArr);
            sortedString[i] = new String(tempArr);

        }
        String s = String.join("", sortedArr);
        StringBuilder reverse =   new StringBuilder();
        reverse.append(s);
        reverse.reverse();
        Arrays.sort(sortedArr);
        System.out.println("The Sorted array of string is:");
        System.out.println(Arrays.toString(sortedArr));
        System.out.println("The Sorted strings are:");
        System.out.println(Arrays.toString(sortedString));
        System.out.println("The joined string is:");
        System.out.println(s);
        System.out.println("The reversed string is:");
        System.out.println(reverse);
    }
}