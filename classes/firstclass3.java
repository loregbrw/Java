import java.util.*; // importa tudo da util

class Main {
  public static void main(String[] args) {

    short[] testBytes = {173, 0b01010110, 0b01010110, 55, 200, 255};

    short[] compressedBytes = compress(testBytes);

    short[] uncompressedBytes = uncompress(compressedBytes, 0);
    
    for (int i = 0; i < testBytes.length; i++) {
      System.out.println(testBytes[i]);
    }

    System.out.println();

    for (int i = 0; i < uncompressedBytes.length; i++) {
      System.out.println(uncompressedBytes[i]);
    }
  }
  
  static short[] compress(short[] bytes) {
    short[] compressedBytes = new short[ bytes.length / 2 ];

    for (int i = 0; i < bytes.length; i += 2) {
      short first = (short)(bytes[i] >> 4 << 4);
      short second = (short)(bytes[i + 1] >> 4);
      
      compressedBytes[i / 2] = (short)(first | second);
    }

    return compressedBytes;
  }

  static short[] uncompress(short[] bytes, int fillmode) {
    short[] uncompressedBytes = new short[ bytes.length * 2 ];
    int filled = 0;
    Random rand = new Random();

    for (int i = 0; i < bytes.length; i++) {
      int fillnumber = fillmode == 0 ? 0 : fillmode == 1 ? 7 : rand.nextInt((15 - 0) + 1) + 0;
      
      uncompressedBytes[filled] = (short)(bytes[i] >> 4 << 4 | fillnumber);
      filled++;
      uncompressedBytes[filled] = (short)((bytes[i] << 4) & 0b11111111 | fillnumber);
      filled++;
    }

    return uncompressedBytes;
  }
}