package milestone1.javastring.bufferandbuilder.stringbufferclass;

public class DeleteMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.delete(1,3);
        System.out.println(sb);//prints Hlo
    }
}
