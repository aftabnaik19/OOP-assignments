import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            int choice;
            System.out.println("\nEnter the appropriate choice for simulating exception handling");
            System.out.println("1 for ClassNotFoundException");
            System.out.println("2 for NegativeArraySizeException");
            System.out.println("3 for IllegalArgumentException ");
            System.out.println("4 to exit the process");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    try {
                        Class<?> myClass = Class.forName("Student");
                        System.out.println("Class found: " + myClass.getName());
                    } catch (ClassNotFoundException e) {
                        System.out.println("Class not found!");
                        System.out.println(e);
                    }
                    continue;
                }
                case 2: {
                    int size;
                    System.out.println("Enter the size of the arrray:");
                    size = sc.nextInt();

                    try {
                        int[] arr = new int[size];
                        System.out.println("Enter the elements of the array: ");
                        for (int i = 0; i < size; i++) {
                            arr[i] = sc.nextInt();
                        }
                        System.out.println(Arrays.toString(arr));
                    } catch (NegativeArraySizeException e) {
                        System.out.println("You cannot create an array with negative size.");
                        System.out.println(e);
                    }
                    continue;
                }
                case 3: {
                    try {
                        String s="ab14";
//                        String s="1234";
                        int num = Integer.parseInt(s);

                    } catch (IllegalArgumentException e) {
                        System.out.println("Illegal arguments passed to parseInt method of Integer class");
                        System.out.println(e);
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