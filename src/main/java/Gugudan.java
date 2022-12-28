
public class Gugudan {
    public static void main(String[] args) {
        // 2단 배열 표시
        int[] result = new int[9]; // 배열 이름 과 배열 크기 지정
        for (int i = 0; i < result.length; i++){  // 이 줄은 외우기
            result[i]=2*(i+1); // i 가 0이기 떄문에 + 1을 해줌 2단
        }
        for (int i =0 ; i <result.length; i++){
            System.out.println(result[i]);
        }
        //3단
        result = new int[9]; // result 만 입력함으로 위에 int[] 같은 걸로 표시
        for (int i = 0; i < result.length; i++){
            result[i]=3*(i+1);
        }
        for (int i =0 ; i <result.length; i++){
            System.out.println(result[i]);
        }
    }

}
