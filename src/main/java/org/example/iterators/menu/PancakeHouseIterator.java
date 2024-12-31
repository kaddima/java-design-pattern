package org.example.iterators.menu;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator{
  ArrayList<MenuItem> items;
  int position = 0;

  public PancakeHouseIterator(ArrayList<MenuItem> items){
    this.items = items;
  }

  @Override
  public MenuItem next() {
   return this.items.get(position++);
  }

  @Override
  public boolean hasNext() {
    return items.size() > position;
  }
}
