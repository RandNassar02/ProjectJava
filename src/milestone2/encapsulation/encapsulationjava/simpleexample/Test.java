package milestone2.encapsulation.encapsulationjava.simpleexample;
//A Java class to test the encapsulated class.
public class Test {
    public static void main(String[] args) {
        //creating instance of the encapsulated class
        Student s = new Student();
        //setting value in the name member
        s.setName("Rand");
        //getting value of the name member
        System.out.println(s.getName());
    }
}
