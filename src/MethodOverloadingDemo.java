public class MethodOverloadingDemo {
  public static void main(String[] args) {
//    add2Numbers(1,2);
//    add3Numbers(1,2,3);
//    add4Numbers(1,2,3,4);
  addNumbers(1,2);
  addNumbers(1,2,3);
  addNumbers(1,2,3,4);
  addNumbers(1,2,3,4,5);
  addNumbers(1,2,3,4,5,6);



  }

  private static void addNumbers(int... numbers){
    int result = 0;
    for (int number : numbers) {
      result += number;
    }
    System.out.println(result);
  }


  private static void add4Numbers(int i, int i1, int i2, int i3) {
    System.out.println(i + i1 + i2 + i3);
  }

  private static void add3Numbers(int i, int i1, int i2) {
    System.out.println(i + i1 + i2);
  }

  private static void add2Numbers(int i, int i1) {
    System.out.println(i + i1);

  }


}
