package org.example.observer.editor;

public class EditorTest {
  public static void main(String[] args) {
    Editor editor = new Editor();
    editor.events.subscribe("open",  new LogOpenListener("test.txt"));
    editor.events.subscribe("save", new EmailNotificationListener("admin@gmail.com"));

    try{
      editor.openFile("test.txt");
      editor.saveFile();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
