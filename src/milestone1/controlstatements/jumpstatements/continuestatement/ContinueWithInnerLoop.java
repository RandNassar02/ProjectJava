package milestone1.controlstatements.jumpstatements.continuestatement;

public class ContinueWithInnerLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 2 && j == 2) {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
