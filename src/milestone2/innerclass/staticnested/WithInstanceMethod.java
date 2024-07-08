package milestone2.innerclass.staticnested;

public class WithInstanceMethod {
    static int data = 30;

    static class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {
        WithInstanceMethod.Inner obj = new WithInstanceMethod.Inner();
        obj.msg();
    }
}
