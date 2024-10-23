import java.util.Scanner;




class Maths  {
    static boolean isArmstrong(int n){
        int a = n, sum = 0 ;
        while(a>0){
            sum+= a%10;
            a/=10;
        }
        return sum == n;
    }
    static boolean isPalindrome(int n){
        String s = String.valueOf(n);
         StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1.reverse();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)!=input1.charAt(i))return false;
        }
        return true;
    }

    static int reverse(int n) {
        int num1 = 0;
        while(n>0){
            num1 += num1*10+ (n%10);
            n/=10;
        }
        return num1;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter the number: ");
        num = scanner.nextInt();
        boolean isPal = Maths.isPalindrome(num);

        if(isPal)
            System.out.print("The number is a Palindrome\n");
        else
            System.out.print("The number is not a Palindrome\n");

        boolean isArm = Maths.isArmstrong(num);
        if(isArm)
            System.out.print("The number is Armstrong\n");
        else
            System.out.print("The number is not a Armstrong\n");
         num = Maths.reverse(num);
            System.out.print("The reverse number is: "+ num);



    }
}
