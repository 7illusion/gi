import java.util.Scanner;
public class GugudanPro {
//    public static int[] calculatePro(int time){
//        int[] resultPro = new int[19];
//        for (int i= 0; i< resultPro.length;i++){
//            resultPro[i]=time*(i+1);
//        }
//        return resultPro;
//    }
//
//
    public static void main(String[] args) {
        System.out.println("계산을 할 숫자를 입력하세요:");
        Scanner scanner = new Scanner(System.in); // in
        int number = scanner.nextInt();

        if (number < 2){
            System.out.println("오류");
        } else if (number>19) {
            System.out.println("오류");
        }
        else {
            for (int i = 1; i <= number ; i++){
                System.out.println(number*i);
            }
        }
    }
}
