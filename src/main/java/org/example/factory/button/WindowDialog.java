package org.example.factory.button;

public class WindowDialog extends Dialog{
  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
