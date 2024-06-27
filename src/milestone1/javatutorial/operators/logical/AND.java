package milestone1.javatutorial.operators.logical;

public class AND {
    public static void main(String[] args){
        int a=10;
        int b=5;
        int c=20;

        System.out.println(a<b && a<c); //F&&T=F
        System.out.println(a>b & a<c); //T&T=T

        System.out.println(a<b && a++<c);
        System.out.println(a); // 10 Not Checked

        System.out.println(a<b & a++<c);
        System.out.println(a); // 11 Checked
    }
}
