import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input random number");
        int num = scan.nextInt();
        if (num % 10 == 7)
            System.out.println("correctly");
        else System.out.println("incorrectly");
    }
}
