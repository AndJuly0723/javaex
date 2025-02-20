import java.util.Scanner;

public class ArithmeticDemo {
  public static void main(String[] args) {
   /*int a = 1_000_000;
    int b = 2_000_000;

    long result = (long)a * b;
    System.out.println(result);

    int apple = 1;
    float priceUint = 0.1f;
    int number = 7;

    double result2 = number * priceUint;
    System.out.println(result2);*/

    Scanner in = new Scanner(System.in);
    System.out.print("정수를 입력해주세요 : ");
    int i = in.nextInt();


    if(i % 2 == 0){
      System.out.println("짝수입니다.");
    }else{
      System.out.println("홀수입니다.");
    }


  }
}
