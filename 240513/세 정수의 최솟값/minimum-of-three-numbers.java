import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int num : numbers){
            if(num<min){
                min = num;
            }
        }
          System.out.print(min);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}