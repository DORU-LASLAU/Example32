import java.util.Scanner;
public class Example32 {
    public static void main(String[] argv) {
        double y,n;

        Scanner inputValue=new Scanner(System.in);
        System.out.println("Enter a number:");
        n= inputValue.nextInt();
        for (int i=1;i<=10; i++) {
            double x =n;
            y = (x + n/x)/2;
            n=y;
            System.out.println(y);
        }
    }
}
