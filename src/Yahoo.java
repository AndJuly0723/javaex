public class Yahoo {
  public static void main(String[] args) {

    Yahoo yahoo = new Yahoo();  // Yahoo 객체를 생성
    Printer printer = yahoo.new Printer();  // 그 후 Printer 객체를 생성

    printer.println(10);
    printer.println(true);
    printer.println(5.7);
    printer.println("홍길동");
  }

  class Printer {  // 이때 Printer는 내부 클래스 그대로 유지
    public void println(int value) {
      System.out.println("value = " + value);
    }

    public void println(boolean value) {
      System.out.println("value = " + value);
    }

    public void println(double value) {
      System.out.println("value = " + value);
    }

    public void println(String value) {
      System.out.println("value = " + value);
    }
  }
}
