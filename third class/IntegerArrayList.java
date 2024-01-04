public class IntegerArrayList {
  private Integer[] list;
  private int size;
  private int elements;

  public void printAll() {
    for (int i = 0; i < this.size; i++) {
      System.out.println(this.list[i]);
    }
  }

  private void updateElements() {
    this.elements = 0;
    for (int i = 0; i < this.size; i++) {
      if (list[i] != null) {
        this.elements++; 
      }     
    }
  }

  public IntegerArrayList(Integer[] list) {
    this.list = list;
    this.size = list.length;
    this.elements = 0;

    this.updateElements();
  }

  public IntegerArrayList(int size) {
    this.size = size;
    this.elements = 0;
    this.list = new Integer[size];
  }

  public IntegerArrayList() {
    this.size = 10;
    this.elements = 0;
    this.list = new Integer[10];
  }

  public Integer get(int index) {
    return this.list[index];
  }

  public void set(int index, Integer value) {
    if (index <= this.elements) {
      this.list[index] = value;
      this.updateElements();
    }
  }

  public void add(Integer value) {
    if (this.elements == this.size) {
      Integer[] newArray = new Integer[this.size * 2];
      for (int i = 0; i < this.size; i++) {
        newArray[i] = this.list[i];
      }
      this.list = newArray;
      this.size = this.size * 2;
    }

    this.list[elements] = value;
    this.updateElements();
  }

  public boolean contains(Integer value) {
    for (int i = 0; i < this.elements; i++) {
      if (this.list[i].equals(value)) {
        return true;
      }
    }
    return false;
  }

  public int getSize() {
    return this.size;
  }

  public void clear() {
    this.size = 10;
    this.elements = 0;
    this.list = new Integer[10];
  }

  public int indexOf(Integer value) {
    for (int i = 0; i < this.elements; i++) {
      if (this.list[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  public boolean isEmpty() {
    return this.elements == 0;
  }

  public IntegerArrayList clone() {
    return new IntegerArrayList(this.list);
  }
}