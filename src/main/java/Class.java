public class Class {
    public static void main(String[] args) {

        // 앞에 있는 것을 메소드 랑 반복문으로 매우 짧게 작성 2~9까지
        for (int i = 2; i < 10; i++) {
            int[] result = Methood.calculate(i); // Methood 에 있는 메소드를 가지고옴
            Methood.print(result); // 배열을 프린트
        }
    }
}
