import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" " + " ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print(num + " ");
                num++;
                if(num>9){
                    num=1;
                }
            }
            System.out.println();
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}