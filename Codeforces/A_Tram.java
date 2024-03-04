import java.util.Scanner;

public class A_Tram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int minimumCapacity = 0;
    int capacity = 0;

    for (int i = 0; i < n; i++) {
      int exit = scanner.nextInt();
      int enter = scanner.nextInt();
      capacity -= exit;
      capacity += enter;
      if (capacity > minimumCapacity) {
        minimumCapacity = capacity;
      }
    }

    System.out.println(minimumCapacity);
    scanner.close();
  }
}