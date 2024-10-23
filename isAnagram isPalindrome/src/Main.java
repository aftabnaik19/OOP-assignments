import java.util.Scanner;

class Main {
        static boolean  isPalindrome(String s){
        for(int i = 0  ; i < s.length()/2 ; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
        }
        return true;
    }
    static boolean isAnagram(String s1 , String s2){
        int[] arr1 = new int[26] ;
        int[] arr2 = new int[26] ;
        s1=s1.toLowerCase();
        s2= s2.toLowerCase();
        for (int i = 0 ; i < s1.length() ; i++){
            arr1[(int)s1.charAt(i)-(int)'a']++;
            arr2[(int)s2.charAt(i)-(int)'a']++;
        }
        for (int i = 0 ; i < 26 ; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the string to check Palindrome or not: ");
        String s = sc.nextLine();
        if(isPalindrome(s)) System.out.println("The String is a Palindrome");
        else System.out.println("The string is not a Palindrome");
        System.out.println("Please enter string to check anagram or not: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(isAnagram(s1,s2))
        System.out.println("The Strings are anagram");
        else
            System.out.println("The Strings are not anagram");

    }
}