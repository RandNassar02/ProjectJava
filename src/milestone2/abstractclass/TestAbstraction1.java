package milestone2.abstractclass;

abstract class  Shape{
    abstract void draw();
}

 class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
 }

 class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
 }

public class TestAbstraction1 {
public static void main(String[] args) {
    Shape circle = new Circle();
    circle.draw();
}
}
