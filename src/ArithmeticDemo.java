import org.w3c.dom.ls.LSOutput;

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
    int remainder = i % 2;
    String evenOdd = (remainder == 0) ? "짝수" : "홀수" ;
    System.out.printf("입력한 수는 %d 이며, %s 입니다.", i, evenOdd);






  }
}
