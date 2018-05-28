import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        double a = 0, b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a   ");
        a = scan.nextDouble();
        if (a < 0)
            System.out.println("number < 0 !!!!");
        System.out.println("Input b   ");
        b = scan.nextDouble();
        if (b < 0)
            System.out.println("number < 0 !!!!");
        System.out.println("Input r   ");
        double r = scan.nextDouble();
        double diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (r >= diagonal / 2)
            System.out.println("yes, you can");
        else System.out.println("no, you can't");

    }
}
