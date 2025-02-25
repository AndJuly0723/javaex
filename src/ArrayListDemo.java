import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> scores = new ArrayList<>();
    System.out.println("scores.size() = " + scores.size());
    scores.add(10);
    System.out.println("scores size = " + scores.size());
    scores.add(20);
    scores.add(30);
    System.out.println("scores = " + scores.size());

    System.out.println(scores.get(0));
    System.out.println(scores.get(1));
    System.out.println(scores.get(2));


  }
}
