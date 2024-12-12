package org.example.factory.button;

public class HtmlButton implements Button{
  public void render(){
    System.out.println("<button>Test Button</button>");
    onClick();
  }

  @Override
  public void onClick() {
    System.out.println("click! Button says- Hello world");
  }
}
