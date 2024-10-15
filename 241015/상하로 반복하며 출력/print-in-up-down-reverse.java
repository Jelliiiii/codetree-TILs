import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int firstNum = i;           
            int secondNum = n + 1 - i;  
            
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(firstNum);
                } else {
                    System.out.print(secondNum);
                }
            }
            System.out.println(); 
        }
        
        sc.close();
    }
}