import java.util.*; // importa tudo da util

class ArrayAndRandom {
  public static void main(String[] args) {

    byte[] bytes = new byte[256];

    var rand = new Random();
    rand.nextBytes(bytes);

    int k = 0;

    while (k < bytes.length) {
      System.out.println(bytes[k]);
      k++;
    }
    
    if (bytes[0] == -128) {
      System.out.println("Yep");
    }
    
    for (int i = 0; i < bytes.length; i++) {
      System.out.print(bytes[i] + " ");
    }

  }
}