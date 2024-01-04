import java.util.*;

class Main {
  public static void main(String[] args) {
    IntegerArrayList list = new IntegerArrayList();

    System.out.println(list.size);
  }

  public static class IntegerArrayList {
    Integer[] list;
    int size;
    int elementes;

    public IntegerArrayList(Integer[] list) {
      this.list = list;
      this.size = list.length;
      this.elementes = 0;

      for (int i = 0; i < list.length; i++) {
        if (list[i] != null) {
          this.elementes++; 
        }     
      }
    }

    public IntegerArrayList(int size) {
      this.size = size;
      this.elementes = 0;
      this.list = new Integer[size];
    }

    public IntegerArrayList() {
      this.size = 10;
      this.elementes = 0;
      this.list = new Integer[10];
    }
  }
}