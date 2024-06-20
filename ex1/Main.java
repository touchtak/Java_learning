import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("何人分の情報を入力しますか：");
    int n = scanner.nextInt();

    int oldestAge = 0;
    int sumAge = 0;

    for (int i = 0; i < n; i++) {
      System.out.println(i + 1 + "人目");

      System.out.print("名前：");
      String firstName = scanner.next();

      System.out.print("名字：");
      String lastName = scanner.next();

      System.out.print("年齢：");
      int age = scanner.nextInt();

      System.out.print("身長(m)：");
      double height = scanner.nextDouble();

      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();

      Person.printData(firstName, lastName, age, height, weight);

      if (oldestAge < age) {
        oldestAge = age;
      }

      sumAge += age;
    }

    int averageAge = sumAge / n;

    System.out.println("最高年齢は" + oldestAge +"歳です");
    System.out.println("平均年齢は" + averageAge +"歳です");

  }
 }