package milestone1.controlstatements.jumpstatements.continuestatement;

public class ContinueInWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}