import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {
  public static void main(String[] args) {
    // 재활용성/유지보수가 편하게 작성할것
    // 1. 시험점수를 사용자로부터 입력받는다. 단, 과목의 수는 정해져있지 않다.
    // 2. -1 을 입력받을 때 까지 과목의 점수를 입력받는다.
    // 3. 입력받은 점수를 배열에 저장한다.
    // 4. while 문을 사용한다.
    // 5. 입력받은 점수가 저장되어 있는 배열을 전부 읽어서 합계와 평균을 구한다.
    // 6. 입력받은 점수, 합계와 평균을 출력한다.

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
    int score, total = 0;

    while(true) {
      System.out.print("과목의 점수를 입력하세요 : ");

    }
    //System.out.println("scores = " + scores);
    for( int i =0; i < scores.size(); i++){
      total += scores.get(i);
    }

    System.out.println("합계 = " + total);
    System.out.println("평균 = " + total / scores.size());






  }
}
