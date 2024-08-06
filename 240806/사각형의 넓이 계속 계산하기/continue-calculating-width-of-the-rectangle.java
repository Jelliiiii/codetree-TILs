import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int wid = sc.nextInt();
            int hei = sc.nextInt();
            String cha = sc.next();

            int area = wid * hei;
            System.out.println(area);
            if(cha.equals("C")){
                break;
            }
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}