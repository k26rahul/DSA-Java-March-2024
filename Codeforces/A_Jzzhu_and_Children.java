
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A_Jzzhu_and_Children
 */
public class A_Jzzhu_and_Children {
  public static void main(String[] args) {
    // try {
    // System.setIn(new
    // FileInputStream("C:/k26rahul/Code/Sanika/Codeforces/input.txt"));
    // } catch (FileNotFoundException e) {
    // e.printStackTrace();
    // }

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    ArrayList<int[]> children = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      int wants = scanner.nextInt();
      children.add(new int[] { i, wants });
    }

    int last = -1;
    while (!children.isEmpty()) {
      ArrayList<int[]> newChildren = new ArrayList<>();
      for (int[] child : children) {
        int i = child[0];
        int wants = child[1];
        last = i;
        if (wants > m) {
          newChildren.add(new int[] { i, wants - m });
        }
      }
      children = newChildren;
    }

    System.out.println(last);
    scanner.close();
  }
}