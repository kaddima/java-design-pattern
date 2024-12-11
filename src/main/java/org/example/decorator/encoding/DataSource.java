package org.example.decorator.encoding;

public interface DataSource {
  void writeData(String data);
  String readData();
}
