class Person {
  public String name;

  Person(String name) {
    System.out.println("インスタンスが生成されました");
    this.name = name;

  }

  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}
