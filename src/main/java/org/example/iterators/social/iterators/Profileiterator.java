package org.example.iterators.social.iterators;

import org.example.iterators.social.profile.Profile;

public interface Profileiterator {
  boolean hasNext();
  Profile getNext();
  void reset();
}
