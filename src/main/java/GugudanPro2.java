import java.util.Scanner;
public class GugudanPro2 {
    public static void main(String[] args) {
        System.out.println("숫자를 두개를 입력해주세요:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);

        String inputValue = ",";
        String[] splitValue = inputValue.split(","); // 문자를 받을 때는 String 으로 한다


        int first = Integer.parseInt(splitValue[0]);
        int second = Integer.parseInt(splitValue[1]);

        for (int i = 1; i < number; i++){
            System.out.println(number*i);
        }


    }
}
