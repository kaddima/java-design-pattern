package org.example.decorator.encoding;

public class EncodingTest {
  public static void main(String[] args) {
    DataSource ds = new FileDataSource("test.txt");
    //System.out.println(ds.readData());

    EncryptionDecorator en = new EncryptionDecorator(ds);
    System.out.println(en.encode("th"));
  }

}
