import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.util.Scanner;

public class WhileDemo3 {
  public static void main(String[] args) {
    // 초기식
    Scanner in = new Scanner(System.in);
    System.out.print("구구단 몇 단을 출력할까요 ?");
    int dan = in.nextInt();

    int i = 0;
    //while () 무한반복
    while(true){
      // 조건식, 분기식
      if(dan < 2 || dan > 9){
        break;
      }
      // 반복실행문
      for (i = 1; i <= 9; i++) {
          System.out.printf("%d * %d = %d\n", dan, i, dan*i);
          continue;
        }
      // 증감식
      System.out.print("구구단 몇 단을 출력할까요?");
      dan = in.nextInt();
      }


    }
  }

