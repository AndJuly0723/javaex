import java.util.Arrays;

public class ArrayDeom2 {
  public static void main(String[] args) {
    // 초기화 방법 1
    int[] scores = {90, 80, 95, 85, 70, 10, 20, 30, 40, 50, 100, 60};
    System.out.println("scores = " + Arrays.toString(scores));
    // 초기화 방법 2
    int[] scores1 = new int[]{1,2,3,4,5};

    // 초기화 방법 3
    int[] scores2;
    scores2 = new int[] {1,2,3,4,5};

    // error
    // int[] scores3;
    // scores3 = {1,2,3,4,5};
    System.out.println("scores[10] = " + scores[scores.length - 1]);

    for (int i = 0; i < scores.length-1; i++) {
      if(scores[i] == 100){
        System.out.printf("%d 번째에서 찾았다.\n", i);
        break;
      }
    }



  }
}
