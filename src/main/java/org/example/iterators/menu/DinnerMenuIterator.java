package org.example.iterators.menu;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
  MenuItem[] items;
  int position = 0;

  public DinnerMenuIterator(MenuItem[] items){
    this.items = items;
  }

  @Override
  public MenuItem next() {
    MenuItem menuItem = items[position];
    position += 1;
    return menuItem;
  }

  @Override
  public boolean hasNext() {
    return position < items.length && items[position] != null;
  }

  @Override
  public void remove() {
    if(position <= 0){
      throw new IllegalStateException("you can't remove an item " +
              "unless you've done at least one next()");
    }
    if(items[position-1] != null){
      for(int i=position-1; i < (items.length-1); i++){
        items[i] = items[i+1];
      }
      items[items.length-1] = null;
    }
  }
}
