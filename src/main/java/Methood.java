public class Methood { // 메소드는 함수랑 비슷하다고 생각하자
 public static int[] calculate(int times){ // 메소드의 이름 calculate , 입력값과 실행 결과를 출력
     int[] result = new int[9]; // result 라는 배열 생성 및 크기 설정
     for (int i = 0; i < result.length; i++){  //
         result[i]=times*(i+1); //  숫자 대신 times 가 대신 들어감
     }
     return result; // result 에 반환
 }
 public static void print(int[] result){ // 메소드 이름 print
     for (int i =0; i <result.length;i++){
         System.out.println(result[i]);
     }
 }
    public static void main(String[] args) {

    // 앞에 있는 것을 메소드 랑 반복문으로 매우 짧게 작성 2~9까지
     for (int i = 2; i<10;i++){
         int[] result = calculate(i);
         print(result); // 배열을 프린트
     }



     // 메소드 calculate 랑 print 을 사용하여 사용하세 짧게 표현 2~9까지 하나하나 해야함
//        int[] result = calculate(2); // 자동으로 times
//        print(result);



        // for 문으로 작성된 구구단 2~9까지 하나하나 해야함
//        for ( int i =0; i < result.length; i++){
//            System.out.println(result[i]);
//        }


    }
}
