package org.example.iterators.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
  ArrayList<MenuItem> menuItems;

  public PancakeHouseMenu(){
    menuItems = new ArrayList<>();
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
    menuItems.add(menuItem);
  }

  public ArrayList<MenuItem> getMenuItems() {
    return menuItems;
  }

  public Iterator<MenuItem> createIterator(){
    return menuItems.iterator();
  }
}
