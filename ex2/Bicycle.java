class Bicycle {
  private String name;
  private String color;
  private int distance = 0;

  Bicycle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return this.name;
  }

  public void run(int distance) {
    this.distance = distance;

    System.out.println(distance + "km走ります");
    System.out.println("走行距離：" + distance + "km");
  }

  public void printData() {
    System.out.println("【自転車の情報】");
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }
}