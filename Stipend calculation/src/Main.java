import java.util.Scanner;

class StudentStipend{
    final int standardStipend = 100;
    int studentId;
    int marks;
    int calculateTotalStipend(){
        if(this.marks>=95)return standardStipend+20;
        else if(this.marks>=90)return standardStipend+15;
        else if(this.marks>=85)return standardStipend+10;
        else return standardStipend;
    }
}

public class Main {
    public static void main(String[] args) {
        StudentStipend student1 = new StudentStipend();
        System.out.println("Enter the student id: ");
        Scanner sc = new Scanner(System.in);
        student1.studentId=sc.nextInt();
        System.out.println("Enter the student's marks: ");
        student1.marks=sc.nextInt();
        System.out.println("The Stipend for StudentId " + student1.studentId +" is " + student1.calculateTotalStipend()  + "$");

    }
}