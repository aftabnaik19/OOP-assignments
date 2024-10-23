import java.util.Scanner;

class Person{
    String name;
    int age;

}
class Employee extends Person{
    String designation;
    int salary;
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        Employee[] PersonList = new Employee[5];
        for(int i = 0 ; i < 5 ; i++){
//            System.out.println(STR."Enter details for the \{i} empoyee:");
            PersonList[i] = new Employee();
            System.out.println("Enter employee name:");
            PersonList[i].name=sc.nextLine();
            System.out.println("Enter employee age:");
            PersonList[i].age=sc.nextInt();
            System.out.println("Enter employee designation:");
            PersonList[i].designation=sc.nextLine();
            PersonList[i].designation=sc.nextLine();
            System.out.println("Enter employee salary:");
            PersonList[i].salary=sc.nextInt();
            sc.nextLine();
        }
        for(int i = 0 ; i < 5 ; i++){
           if(PersonList[i].salary>=5000){
               System.out.println(PersonList[i].name);
           }
        }

    }
}