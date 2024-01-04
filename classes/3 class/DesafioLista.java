import java.util.*;

class DesafioLista {
  public static void main(String[] args) {
    
    IntegerArrayList list = new IntegerArrayList();

    list.set(0, 55);
    list.add(23);
    list.add(44);

    list.add(77);
    list.add(11);
    list.add(9);


    list.printAll();

    System.out.println(list.get(0));
    System.out.println(list.get(1));

    System.out.println(list.contains(23));

    System.out.println(list.indexOf(23));

    System.out.println();
    System.out.println("===");
    System.out.println();

    list.sort();

    list.printAll();
  }
}