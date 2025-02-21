public class SwitchDemo  {
  public static void main(String[] args) {
    whoISIT("호랑이");
    whoISIT("참새");
    whoISIT("카카오");


  }
  static void whoISIT(String animal){
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
