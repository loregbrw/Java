class Main {
  public static void main(String[] args) {
    var arr = new ArrayList<String>();
    arr.add("World");
    arr.add("Hello");
    arr.add("Java");
    arr.add("C#");
    arr.add("Python");
    
    arr.sort((a, b) -> a.compareTo(b));

    for (int i = 0; i < arr.size(); i++)
    {
       System.out.println(arr.get(i)); 
    }
  }
}