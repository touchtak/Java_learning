import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Bicycle bicycle = new Bicycle ("ビアンキ", "緑");

    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int i = scanner.nextInt();
    bicycle.run(i);

    System.out.println("=================");
    Car car = new Car("フェラーリ", "赤");
    car.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int n = scanner.nextInt();
    car.run(n);
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int chargeFuel = scanner.nextInt();
    car.charge(chargeFuel);
  }
}