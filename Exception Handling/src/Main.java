import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean flag = true;
        while(flag){
            int choice;
            System.out.println("\nEnter the appropriate choice for simulating exception handling");
            System.out.println("1 for divide by 0 exception ");
            System.out.println("2 for Index out of bound exception");
            System.out.println("3 for Null Pointer exception ");
            System.out.println("4 to exit the process");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    int a, b;
                    System.out.println("Enter the dividend: ");
                    a = sc.nextInt();
                    System.out.println("Enter the divisor: ");
                    b = sc.nextInt();
                    try {
                        int quotient = a / b;
                        System.out.println("The quotient is: " + quotient);
                    } catch (ArithmeticException e) {
                        System.out.println("You shouldn't divide a number by Zero!");
                    }
                    continue;
                }
                case 2: {
                    int size;
                    System.out.println("Enter the size of the arrray:");
                    size = sc.nextInt();
                    int[] arr = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }
                    int index;
                    System.out.println("Enter the index of element you have to access:");
                    index = sc.nextInt();
                    try {
                        System.out.println("The element at index " + index + " is " + arr[index - 1]);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("OOPs!!!Array Index "+index+" is out of bounds for length "+size);
                    }
                    continue;
                }
                case 3: {
                    System.out.println("\nHandling Null pointer exception");
                    String s;
//                    s  = "abcd" ;
                    s = null;
                    try {
                        int slen = s.length();
                        System.out.println("The length of string is: " + slen);

                    } catch (NullPointerException e) {
                        System.out.println("String does not exist (null pointer exception) ");
                    }
                    continue;
                }
                case 4: {
                    flag = false;
                }
            }
        }

    }
}