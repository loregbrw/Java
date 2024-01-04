// import java.util.Scanner; // leitura de dados
import java.util.*; // importa tudo da util

class ScanAndSet {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(2 * n); // printa o input * 2

    sc.close();

    // ======== NOTES ========

    byte b;  // 8 bits  -> 2^8 = 256 (-127 a 128)
    short s; // 16 bits -> 2^16 = 65536 (-32768 a 32767)
    int i;   // 32 bits -> 2^32 = 4294967296 (-2147483648 a 2147483647)
    long l;  // 64 bits -> 2^64 = 18446744073709551616 (-9223372036854775808 a 9223372036854775807)

    float f; // 32 bits -> 2^32
    double d; // 64 bits -> 2^64

    char c;

    // mais usados:

    Long lg = 30000;
    String st = "Hello World";
    Boolean bl = true;
    Integer ig = 100;
  }
}