import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
        int firstMultiple = ((a + c - 1) / c) * c;

        if (firstMultiple <= b) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }
        
        sc.close();
    }
}