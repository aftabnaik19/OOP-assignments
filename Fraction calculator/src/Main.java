import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1  , d1, n2, d2;
        System.out.println("Enter the numerator and denominator of the first fraction: ");
        n1 = sc.nextDouble();
        d1 = sc.nextDouble();
        System.out.println("Enter the numerator and denominator of the second fraction: ");
        n2 = sc.nextDouble();
        d2 = sc.nextDouble();
        double multiplication =  (n1*n2)/ (d1*d2);
        double division = (n1*d2)/(n2*d1);
        double addition = (n1/d1)+(n2/d2);
        double subtraction = (n1/d1)-(n2/d2);

        System.out.printf("The addition is: %.2f \n",addition);
        System.out.printf("The subtraction is: %.2f\n", subtraction);
        System.out.printf("The multiplication is: %.2f \n", multiplication);
        System.out.printf("The division is: %.2f \n", division);
//        System.out.println("Hello world!");
    }
}