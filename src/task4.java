import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number");
        int money = scan.nextInt();
        int x = money % 100;
        int y = money % 10;
        // Наверное это не самое рациональное решение
        if ((x >= 00 && x <= 99) && y == 0)
            System.out.println(money + " рублей"); // for 110-199 210 310 etc.
        else if (x == 11 && y == 1)
            System.out.println(money + " рублей"); // for 111 211 311 etc.
        else if (x == 1 || y == 1)
            System.out.println(money + " рубль");
        else if (5 > x && x > 1 || y > 1 && y < 5)
            System.out.println(money + " рубля");
        else if (20 > x && x > 10 || y > 5 && y < 10)
            System.out.println(money + " рублей");
    }
}
