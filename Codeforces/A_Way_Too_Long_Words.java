import java.util.Scanner;

/**
 * A_Way_Too_Long_Words
 */
public class A_Way_Too_Long_Words {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();
    scanner.nextLine();

    for (int t = 0; t < T; t++) {
      String word = scanner.nextLine();

      if (word.length() > 10) {
        System.out.print(word.charAt(0));
        System.out.print(Integer.toString(word.length() - 2));
        System.out.print(word.charAt(word.length() - 1));
        System.out.println();
      } else {
        System.out.println(word);
      }
    }

    scanner.close();
  }
}