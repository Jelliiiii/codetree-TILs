import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1; i<=9; i++){
            if(i%2==0){
                for(int j=b; j>=a; j--){
                    System.out.print(j + " * " + i + " = " + (j*i));
                    if(j>a){
                        System.out.print(" / ");
                    }
            }
            System.out.println();
            }
            
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}