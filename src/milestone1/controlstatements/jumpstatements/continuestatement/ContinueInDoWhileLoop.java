package milestone1.controlstatements.jumpstatements.continuestatement;

public class ContinueInDoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}
