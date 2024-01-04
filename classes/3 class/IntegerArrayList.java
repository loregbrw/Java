class IntegerArrayList {
  private Integer[] list;
  private int size;
  private int elements;

  void printAll() {
    for (int i = 0; i < this.size; i++) {
      System.out.print(this.list[i] + " ");
    }
    System.out.println();
  }

  private void updateElements() {
    this.elements = 0;
    for (int i = 0; i < this.size; i++) {
      if (list[i] != null) {
        this.elements++; 
      }     
    }
  }

  IntegerArrayList(Integer[] list) {
    this.list = list;
    this.size = list.length;
    this.elements = 0;

    this.updateElements();
  }

  IntegerArrayList(int size) {
    this.size = size;
    this.elements = 0;
    this.list = new Integer[size];
  }

  IntegerArrayList() {
    this.size = 10;
    this.elements = 0;
    this.list = new Integer[10];
  }

  Integer get(int index) {
    return this.list[index];
  }

  void set(int index, Integer value) {
    if (index <= this.elements) {
      this.list[index] = value;
      this.updateElements();
    }
  }

  void add(Integer value) {
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

  boolean contains(Integer value) {
    for (int i = 0; i < this.elements; i++) {
      if (this.list[i].equals(value)) {
        return true;
      }
    }
    return false;
  }

  int getSize() {
    return this.size;
  }

  void clear() {
    this.size = 10;
    this.elements = 0;
    this.list = new Integer[10];
  }

  int indexOf(Integer value) {
    for (int i = 0; i < this.elements; i++) {
      if (this.list[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  boolean isEmpty() {
    return this.elements == 0;
  }

  public IntegerArrayList clone() {
    return new IntegerArrayList(this.list);
  }

  Integer remove(int index) {
    Integer value = this.list[index];
    this.list[index] = null;

    for (int i = index; i < this.elements; i++) {
      this.list[i] = this.list[i + 1];
    }
    return value;
  }

  boolean remove(Integer value) {
    for (int i = 0; i < this.elements; i++) {
      if (this.list[i].equals(value)) {
        this.remove(i);
        return true;
      }
    }
    return false;
  }

  void sort() {
    Integer[] sortedArray = new Integer[this.size];

    for(int i = 0; i < this.elements; i++) {
      int highestIndex = 0;
      
      for (int j = 1; j < this.elements - i; j++) {
        if(this.list[j] != null && this.list[highestIndex].compareTo(this.list[j]) > 0) {
          highestIndex = j;
        }
      }
      sortedArray[i] = this.list[highestIndex];
      this.remove(highestIndex);
    }
    this.list = sortedArray;
  }
}