package org.example.decorator.encoding;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator{
  public EncryptionDecorator(DataSource source){
    super(source);
  }

  @Override
  public void writeData(String data) {
    super.writeData(encode(data));
  }

  @Override
  public String readData() {
    return decode(super.readData());
  }

  public String encode(String data){
    byte[] result = data.getBytes();
    for (int i = 0; i < result.length; i++) {
      System.out.println("before encoding "+ result[i]);
      result[i] += (byte) 1;
      System.out.println("after encoding "+ result[i]);
    }

    return Base64.getEncoder().encodeToString(result);
  }

  private String decode(String data){
    byte[] result = Base64.getDecoder().decode(data);
    for (int i = 0; i < result.length; i++) {
      result[i] -= (byte) 1;
    }
    return new String(result);
  }
}
