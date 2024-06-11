class eight {
  public static void main (String[] args) {
    int number = 13;

    switch (number % 5) {
      case 0:
        System.out.println("大吉です");
        break;
      case 4:
        System.out.println("凶です");
        break;
      default:
        System.out.println("吉です");
        break;
    }
  }
}