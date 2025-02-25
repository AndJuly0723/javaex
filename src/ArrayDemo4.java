import java.util.Arrays;

public class ArrayDemo4 {
  public static void main(String[] args) {
    String[] names = new String[3];
    System.out.println(Arrays.toString(names));
    names[0] = "kim";
    System.out.println(Arrays.toString(names));
    names[1] = "Lee";
    System.out.println(Arrays.toString(names));
    names[2] = "shin";
    System.out.println(Arrays.toString(names));
  }
}
