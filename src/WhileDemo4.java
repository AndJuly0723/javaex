import java.util.Scanner;

public class WhileDemo4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("동물 이름을 입력하세요. (종료하려면 stop을 입력하세요) : ");
    String animal = in.nextLine(); // 초기식
    String kind = "";
    while(true){
      if(animal.equalsIgnoreCase("stop")){
        break;
      }
      whoIsIT(animal);
      System.out.print("동물 이름을 입력하세요. (종료하려면 stop을 입력하세요) : ");
      animal = in.nextLine();

    }
  }

  private static void whoIsIT(String animal){
    String kind = "";
    switch (animal) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "독수리":
      case "참새":
        kind = "조류";
        break;
      case "고등어":
      case "연어":
        kind = "어류";
        break;
      default:
        kind = "분류할 수 없음";
    }
    System.out.printf("%s는 %s 입니다.\n", animal, kind);

  }
}


