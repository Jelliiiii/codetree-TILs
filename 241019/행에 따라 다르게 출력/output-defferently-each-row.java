import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    System.out.print(num + " ");
                    num++;
                }
            }else{
                int num2 = num+1;
                for(int j=0; j<n; j++){
                    System.out.print(num2 + " ");
                    num2+=2;
                }
                num = num2-1;
            }
            System.out.println();
        }

        sc.close();
    }
}