public class task1 {
    
public static void main(String[] args) {
       
String s = "qwertyuiop";
        
System.out.println("Length = " + s.length());
        
String s1, s2;
        int half = s.length() / 2;
       
 s1 = s.substring(0, half);
        s2 = s.substring(half);
       
System.out.println("First half - > " + s1);
        
System.out.println("Second half - > " + s2);
    }
}
