import java.util.Scanner;

public class ForDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("구구단을 지정하세요 : ");
    int dan = in.nextInt();
    int i = 1;
    for (i = 1; i < 10; i++) {
      System.out.printf("%d * %d = %d\n", dan, i, dan*i);
    }

    }
}

