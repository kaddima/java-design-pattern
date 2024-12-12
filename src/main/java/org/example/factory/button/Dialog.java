package org.example.factory.button;

public abstract class Dialog {
  public void renderWindow(){
    Button okButton = createButton();
    okButton.render();
  }

  /**
   * Subclasses will override this method in order to create specific button
   * objects.
   */
  public abstract Button createButton();
}
