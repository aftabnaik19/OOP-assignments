class AgeNotWithinRangeException extends Exception{
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
class NameNotValid extends Exception{
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}

class Student {
    int age;
    int roll_no;
    String name;
    String course;
    Student(int roll_no, int age , String name, String course) throws AgeNotWithinRangeException,NameNotValid{
        if(age<15 || age>21)throw new AgeNotWithinRangeException();
        if(!name.matches("[a-zA-Z]+")){
            throw new NameNotValid();
        }
        this.age =age;
        this.roll_no = roll_no;
        this.name = name;
        this.course = course;
    }
}

public class Main {
    public static void main(String[] args) {

        Student atharva=null, vaibhav= null, aftab=null , varad = null;
        try{
             atharva = new Student(51, 21, "Atharva" , "Entc");
        }catch(NameNotValid|AgeNotWithinRangeException e ) {
            e.printStackTrace();
        }

        try{
            aftab = new Student(46, 22, "Aftab" , "DSA");
        }catch(NameNotValid|AgeNotWithinRangeException e ) {
            e.printStackTrace();
        }

        try{
             vaibhav = new Student(61, 21, "Vai'bhav" , "Entc");
        }catch(NameNotValid|AgeNotWithinRangeException e ) {
            e.printStackTrace();
        }

        try{
             varad = new Student(60, 20, "Varad" , "Entc");
        }catch(NameNotValid|AgeNotWithinRangeException e ) {
            e.printStackTrace();
        }

        if(atharva!=null)
            System.out.println(atharva.name);
        if(vaibhav!=null)
            System.out.println(vaibhav.name);
        if(aftab!=null)
            System.out.println(aftab.name);
        if(varad!=null)
            System.out.println(varad.name);
    }
}