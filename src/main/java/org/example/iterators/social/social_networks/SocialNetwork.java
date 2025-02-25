package org.example.iterators.social.social_networks;

import org.example.iterators.social.iterators.Profileiterator;

public interface SocialNetwork {
  Profileiterator createFriendsIterator(String profileEmail);
  Profileiterator createCoworkersIterator(String profileEmail);
}
