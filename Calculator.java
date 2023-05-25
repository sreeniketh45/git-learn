import java.util.Scanner;

public class Calculator {
    public static int add(int a1, int a2){
        return a1+a2;
    }
    public static int sub(int a1, int a2){
        return a1-a2;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first input value : ");
        int a = obj.nextInt();
        System.out.println("Enter second input value : ");
        int b = obj.nextInt();
        int c = add(a,b);
        int d = sub(a,b);
        System.out.println("Sum is "+c);
        System.out.println("Diff is "+d);
    }
}
