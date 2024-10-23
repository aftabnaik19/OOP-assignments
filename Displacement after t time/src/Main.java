import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float t, x, v;
        final float g = 9.78033f;
        System.out.println("Enter the value of x0, v0 and t: ");
        Scanner sc = new Scanner(System.in);
        x=sc.nextFloat();
        v=sc.nextFloat();
        t=sc.nextFloat();
        final double coordinate = v*t - (float)(0.5f)*g*t*t + x;
        System.out.println("The final postion is: "+ coordinate);
    }
}