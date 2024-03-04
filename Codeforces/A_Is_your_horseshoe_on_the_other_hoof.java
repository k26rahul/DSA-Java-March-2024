
/**
 * A_Is_your_horseshoe_on_the_other_hoof
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class A_Is_your_horseshoe_on_the_other_hoof {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // int[] horseshoes = new int[4];
    // for (int i = 0; i < 4; i++) {
    // horseshoes[i] = scanner.nextInt();
    // }

    // HashSet<Integer> horseshoes_set = new HashSet<>();
    // for (int horseshoe : horseshoes) {
    // horseshoes_set.add(horseshoe);
    // }

    String[] horseshoes = scanner.nextLine().split(" ");

    HashSet<String> horseshoes_set = new HashSet<>();
    // HashSet<String> horseshoes_set = new HashSet<>(Arrays.asList(horseshoes));
    for (String horseshoe : horseshoes) {
      horseshoes_set.add(horseshoe);
    }

    System.out.println(4 - horseshoes_set.size());
    scanner.close();
  }
}