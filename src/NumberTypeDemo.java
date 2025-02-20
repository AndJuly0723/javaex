public class NumberTypeDemo {
  public static void main(String[] args) {
    // 정수를 선언하고 사용
    int mach = 340;
    int distance = mach * 60 * 60;
    // 문자열과 숫자를 더하면 ==> 문자열
    System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

    // 실수를 선언하고 사용
    double radius = 10.0;
    final double PI = 3.14159265;
    double area;

    area = radius * radius * PI;
    System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);

    System.out.println("----------------------------");

    long mach_L = 340L;
    long distance_L = mach_L * 60 * 60;

    System.out.println("소리가 1시간 동안 가는 거리 : " + distance_L + "m");

    float radius_F = 10.0F;
    final float PI_ = 3.14159265F;
    float area_F = radius_F * radius_F * PI_;

    System.out.println("반지름이 " + radius_F + "인 원의 넓이 : " + area_F);


  }


}
