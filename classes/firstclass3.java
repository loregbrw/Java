import java.util.*; // importa tudo da util

class firstclass3 {
  public static void main(String[] args) {

    short[] testBytes = {173, 0b1010110, 0b01010110, 55, 200, 255};
    compress(testBytes);

    short[] compressedBytes = compress(testBytes);
    
    // System.out.println(compress(testBytes));
  }
  
  static short[] compress(short[] bytes) {
    short[] compressedBytes = new short[ bytes.length / 2 ];

    for (int i = 0; i < bytes.length; i += 2) {
      short first = (short)(bytes[i] >> 4 << 4);
      short second = (short)(bytes[i + 1] >> 4);
      
      compressedBytes[i / 2] = (short)(first | second);
    }

    for (int i = 0; i < compressedBytes.length; i++) {
      System.out.println(compressedBytes[i]);
    }

    return compressedBytes;
  }

  static short[] uncompress(shrot[] bytes) {
    short[] uncompressedBytes = new short[ bytes.length * 2 ];
    int filled = 0;
    
    for (int i = 0; i < bytes.length; i+= 2) {
      uncompressedBytes[i] = (short)(bytes[i] >> 4 << 4);
      filled++;
      uncompressedBytes[i + 1] = (short)(bytes[i] >> 4); // error
    }

    return uncompresseBytes;
  }
}