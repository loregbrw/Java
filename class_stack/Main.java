public class Main {
  public static void main(String[] args) { 
    var testList = new Stack<Integer>();

    System.out.println(testList.empty());

    testList.push(444);

    System.out.println(testList.peek());

    testList.pop();

    System.out.println(testList.peek());
  }
}