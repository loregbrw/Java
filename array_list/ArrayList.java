public class ArrayList<T> {
  private int count;
  private Object[] arr;

  public ArrayList() {
    count = 0;
    arr = new Object[10];
  }

  public void add(T value) {
    if (count == arr.length) {
      Object[] newArr = new Object[2 * arr.length];
      for (int i = 0; i < arr.length; i++)
        newArr[i] = arr[i];
      arr = newArr;
    }

    arr[count] = value;
    count++;
  }

  public int size() {
    return count;
  }

  public T get(int index) {
    if (index >= 0 && index < count)
      return (T)arr[index];
    
    throw new IndexOutOfBoundsException();
  }

  public void set(int index, T value) {
    if (index < 0 || index >= count)
      throw new IndexOutOfBoundsException();
    
    arr[index] = value;
  }

  public void clear() {
    count = 0;
    arr = new Object[10];
  }

  public Boolean isEmpty() {
    return count == 0;
  }

  public Boolean contains(T value) {
    for (int i = 0; i < count; i++) {
      if (arr[i].equals(value))
        return true;
    }

    return false;
  }

  public int indexOf(T value) {
    for (int i = 0; i < count; i++) {
      if (arr[i].equals(value))
        return i;
    }

    return -1;
  }

  public ArrayList<T> clone() {
    ArrayList<T> copy = new ArrayList<T>();
    
    copy.count = this.count;
    copy.arr = new Object[this.arr.length];
    for (int i = 0; i < count; i++)
      copy.arr[i] = this.arr[i];
    
    return copy;
  }
  
  public T remove(int index) {
    if (index < 0 || index >= count)
      throw new IndexOutOfBoundsException();
    var removedValue = arr[index];

    for (int i = index + 1; i < count; i++) {
      arr[i - 1] = arr[i];  
    }
    count--;

    return (T)removedValue;
  }

  public void remove(T value) {
    int index = indexOf(value);
    if (index == -1)
      return;
    remove(index);
  }
  
}
