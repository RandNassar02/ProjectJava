package milestone2.exceptionhandling.trycatch;

public class TryCatchExample4 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
        // handling the exception
        catch (Exception e) {
            // displaying the custom message
            System.out.println("Can't divided by zero");
        }
    }
}
