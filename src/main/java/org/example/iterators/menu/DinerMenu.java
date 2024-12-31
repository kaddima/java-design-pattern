package org.example.iterators.menu;
import java.util.Iterator;
public class DinerMenu implements Menu{
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];

    addItem("K&B's Pancake Breakfast",
            "Pancake with scrambled eggs",
            true,
            2.99);
    addItem("K&B's Pancake Breakfast",
            "Pancake with scrambled eggs",
            true,
            2.39);
    addItem("K&B's Pancake Breakfast",
            "Pancake with scrambled eggs",
            true,
            2.09);
  }

  public void addItem(String name, String description,
                      boolean vegetarian, double price){
    MenuItem menuItem = new MenuItem(name,
            description,vegetarian,price);
    if(numberOfItems >= MAX_ITEMS){
      System.out.println("Sorry, menu is full");
    }else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems += 1;
    }
  }

  public MenuItem[] getMenuItems() {
    return menuItems;
  }

  public Iterator createIterator(){
    return  new DinnerMenuIterator(menuItems);
  }
}
