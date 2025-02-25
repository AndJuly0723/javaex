public class StringDemo4 {
  public static void main(String[] args) {
    String s1 = new String("Hi");
    String s2 = new String("Java");

    System.out.println("문자열 길이(s1) : " + s1.length());
    System.out.println(s1.charAt(1));

    s1 = s1.concat((s2));

    System.out.println(s1.concat(s2) + "!");
    System.out.println(s1.toLowerCase() + "!");
    System.out.println(s1.substring(0,3) + "!");

    // 3.14를 문자열로 변환하는 법
    String str = "" + 3.14;
    String str1 = String.valueOf(3.14);
    String fruits = String.join("@" ,"apple", "banana", "cherry", "durian");
    System.out.println("fruits = " + fruits);
    String str3 = String.format("%s - %d", "jdk", 14);
    System.out.println("str3 = " + str3);

    // 텍스트 블록 """ ~ """
    String strBlock = """
        <html>
          <body>
            <P>hello, world</p>
          </body>
        </html>
        """;
    System.out.println("strBlock = \n" + strBlock);


  }

}
