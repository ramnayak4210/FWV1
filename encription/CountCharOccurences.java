public class CountCharOccurences {

  public static void main(String[] args) {
    String helloMsg = "hello world";
    Character searchChar = 'l';
    Integer count = 0;
    for (Integer i = 0; i < helloMsg.length(); i++) {
      if (helloMsg.charAt(i) == searchChar) {
        count++;
      }
    }
    System.out.println("Total number of occurence of char " + searchChar + " is:" + count);
  }
}