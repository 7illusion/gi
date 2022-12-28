import java.util.Scanner; // 클래스 import
public class ahffn {
    public static void main(String[] args) {
//    ctrl + d 은 한줄 복사 , ctrl + Y은 한줄 삭제 , ctrl + / 은 주석 처리
        //while 을 사용한 반복문
//        int i = 1; // 변수 지정
//        while (i < 10) // 반복 구간 지정
//        {
//            System.out.println(6*i); // 이게 먼저 와야지 1부터 실행
//            i = i + 1; // 10이 넘으면 자동 종료
//
//        }
//        // for 을 사용한 반복문
//       for (int j = 1 ; j < 10 ;j++ ){// 변수 지정 및 1식 플러스가 되는 지점
//           System.out.println(7*j);
//       }

       // for 문을 사용한
        System.out.println("구구단 중 출력할 단은? : "); // 이 줄 부터 아래 4줄 까지는 기본 외우기  scanner import 위에 지정 하기
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);

        if (number < 2){
            System.out.println("오류");
        }
        else if (number > 9) {
            System.out.println("오류");
        }
        else {
            for (int i = 1; i < 10; i++) {
                System.out.println(number * i);
            }
        }

//        System.out.println("4단");
//        int result = 4*1;
//        System.out.println(result);
//       구구단
//        System.out.println("구구단 중 출력할 단은? : ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(number * 1 );
//        System.out.println(number * 2 );
//        System.out.println(number * 3 );
//        System.out.println(number * 4 );
//        System.out.println(number * 5 );
//        System.out.println(number * 6 );
//        System.out.println(number * 7 );
//        System.out.println(number * 8 );
//        System.out.println(number * 9 );
//        //구구단 출력하는 예제 구현



    }
}
