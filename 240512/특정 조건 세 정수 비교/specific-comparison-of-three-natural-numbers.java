import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        boolean FirstMin = true;
        for(int num : numbers){
            if(numbers[0]>num){
                FirstMin=false;
                break;
            }
        }

        boolean allEqual = true;
        for(int i=1;i<numbers.length; i++){
            if(numbers[0]!=numbers[i]){
                allEqual=false;
                break;
            }
        }
        System.out.print(FirstMin ? "1 ":"0 ");
        System.out.print(allEqual ? "1":"0");

        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}