import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] oo = new int[10];
        int count = 0;

        for(int i=0; i<10; i++){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            oo[i] = num;
            count++;
        }

        for(int i=count-1; i>=0; i--){
            System.out.print(oo[i] + " ");
        }

        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}