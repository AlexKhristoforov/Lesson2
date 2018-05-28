import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        String s = "qwe#qwe?ert#ert?";
        String newS = s.replace("#", "");
        String newNewS = newS.replace("?", "HELLO");
        System.out.println(newNewS);
    }
}
