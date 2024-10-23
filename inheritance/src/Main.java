import java.util.* ;
abstract class Area{
    float  area ;
    abstract public float findArea(float a , float b) ;
}

class Triangle extends Area{
    public float findArea(float  a, float b){
        area = a*b/2 ;
        return area ;
    }
}

class Circle extends Area{
    public float findArea(float  a, float b){
        area = a*b*b ;
        return area ;
    }
}

class Square extends Area{
    public float findArea(float  a, float b){
        return area = a*b ;
    }
    public float findArea(float s){
        this.findArea(s, s) ;
        return area ;
    }
}

class Inheritance{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in) ;
        System.out.println("enter the height and base of triangle") ;
        float height  = scan.nextFloat() ;
        float base =  scan.nextFloat() ;
        Triangle triangle = new Triangle() ;
        System.out.println("the area of the triangle is :" + triangle.findArea(height, base) ) ;
        System.out.println("enter the pie value and radius :") ;
        float pie = scan.nextFloat() ;
        float radius = scan.nextFloat() ;
        Circle circle = new Circle() ;
        System.out.println("the are of the circle is :" + circle.findArea(pie, radius) ) ;
        System.out.println("enter the side of the square :") ;
        float side = scan.nextFloat() ;
        Square square = new Square() ;
        System.out.println("the area of the square is :" + square.findArea(side) ) ;
    }
}