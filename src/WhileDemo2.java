import java.util.Scanner;

public class WhileDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하세요. ( 종료하려면 - 값을 입력하세요) : ");
    int score = in.nextInt(); //초기식
    String grade = "";
    while(score > 0){ // 조건식
      if (score >= 90 && score <= 100) {
        grade = "A";
        if(score >= 95){
          grade = "A+";
        }else {
          grade = "A0 or A-";
        }
      } else if (score >= 80 && score < 90) {
        grade = "B";
      } else if (score >= 70 && score < 80) {
        grade = "C";
      } else if (score >= 60 && score < 70) {
        grade = "D";
      } else {
        grade = "F";

      }

      if(grade.equals("F")){
        System.out.println("당신은 불합격입니다.");
      }

      System.out.printf("입력한 정수는 %d 이며, 학점은 %s 입니다.\n", score, grade);
      System.out.print("점수를 입력하세요. ( 종료하려면 - 값을 입력하세요) : ");
      score = in.nextInt(); // 증감식
    }

  }
}
