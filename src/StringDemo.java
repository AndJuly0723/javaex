public class StringDemo {
  public static void main(String[] args) {
   Cat c1 = new Cat("나비");
   Cat c2 = new Cat("야옹이");

  }

  static class Cat {
    private final String name;

    public Cat(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }


  }
}
