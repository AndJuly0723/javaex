public class SwitchDemo2 {
  public static void main(String[] args) {
    DayByDay("월");
    DayByDay("토");


  }

  static void DayByDay(String day){
    String result = "";
    result = switch (day){
      case "월", "화", "수", "목", "금" -> "평일";
      case "토", "일" -> "주말";
      default -> "요일이 아님";

    };
    System.out.printf("%s요일은 %s입니다\n",day ,result);
  }

}
