import java.util.Arrays;
import java.util.Scanner;

/**
 * A_Petr_and_Book
 */

/*
 * n = read_integer()
 * pages_a_day = read_list_of_integers()
 * 
 * day = 0
 * done = 0
 * 
 * loop while done < n:
 * if day == 7:
 * day = 0
 * done += pages_a_day[day]
 * day += 1
 * 
 * print(day)
 */

public class A_Petr_and_Book {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] pages_a_day = new int[7];

    for (int i = 0; i < 7; i++) {
      pages_a_day[i] = scanner.nextInt();
    }

    int day = 0;
    int done = 0;

    while (done < n) {
      if (day == 7) {
        day = 0;
      }

      // System.out.println(day);
      // System.out.println(done);
      // System.out.println("day=" + day + ", done=" + done);

      done += pages_a_day[day];
      day++;
    }

    System.out.println(day);

    scanner.close();
  }
}