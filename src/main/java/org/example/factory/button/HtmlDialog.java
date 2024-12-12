package org.example.factory.button;

public class HtmlDialog extends Dialog{
  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
