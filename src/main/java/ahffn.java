import java.util.Scanner; // 클래스 import
public class ahffn {
    public static void main(String[] args) {
//    ctrl + d 은 한줄 복사 , ctrl + Y은 한줄 삭제 , ctrl + / 은 주석 처리

//        //4단
//        System.out.println("4단");
//        int result = 4*1;
//        System.out.println(result);
//
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number * 1 );
        System.out.println(number * 2 );
        System.out.println(number * 3 );
        System.out.println(number * 4 );
        System.out.println(number * 5 );
        System.out.println(number * 6 );
        System.out.println(number * 7 );
        System.out.println(number * 8 );
        System.out.println(number * 9 );
        //구구단 출력하는 예제 구현
    }
}
