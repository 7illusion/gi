public class forPractice {
    public static void main(String[] args) {
        int i,sum = 0; // 초기화 를 해줘야한다. =0으로
        for ( i=1;i<=5;i++ ){
            System.out.println(i); // println 은 한줄 띄고 표현
        }
        for ( i =1; i<=5; i++){
            System.out.print(i); //print 는 한 줄에 표현이 됌
        }

        for (i=1;i<=5;i++){
            sum +=i;
            System.out.printf("1에서%d까지 합은:%d\n",i,sum); //printf 은 String,int,int 형식임
        }
        for (i=1;i<=5;i++) {
            System.out.println(i+"\t"+(11-i)); // \t 는 사이 공간을 만들어 준다.
        }


    }
}
