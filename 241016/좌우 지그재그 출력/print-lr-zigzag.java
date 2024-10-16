import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int startNum = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { 
                for (int j = 0; j < n; j++) {
                    System.out.print(startNum + " ");
                    startNum++;
                }
            } else { 
                int endNum = startNum + n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.print(endNum + " ");
                    endNum--;
                    startNum++;
                }
            }
            System.out.println(); 

        sc.close();
    }
}
}