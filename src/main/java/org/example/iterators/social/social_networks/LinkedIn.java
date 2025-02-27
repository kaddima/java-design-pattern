package org.example.iterators.social.social_networks;

import org.example.iterators.social.iterators.LinkedInIterator;
import org.example.iterators.social.iterators.Profileiterator;
import org.example.iterators.social.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements SocialNetwork {
  private List<Profile> contacts;

  public LinkedIn(List<Profile> cache) {
    if (cache != null) {
      this.contacts = cache;
    } else {
      this.contacts = new ArrayList<>();
    }
  }

  public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
    simulateNetworkLatency();
    System.out.println("LinkedIn: Loading profile");
    return findContact(profileEmail);
  }

  public List<String> requestRelatedContactsFromLinkedInApi(String profileEmail, String contactType) {
    simulateNetworkLatency();
    System.out.println("LinkedIn: Loading profile");
    Profile profile = findContact(profileEmail);
    if (profile != null) {
      return profile.getContacts(contactType);
    }
    return null;
  }

  private void simulateNetworkLatency() {
    try {
      Thread.sleep(2500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private Profile findContact(String profileEmail) {
    for (Profile profile : contacts) {
      if (profile.getEmail().equals((profileEmail))) {
        return profile;
      }
    }
    return null;
  }

  @Override
  public Profileiterator createFriendsIterator(String profileEmail) {
    return new LinkedInIterator(this, "friends", profileEmail);
  }

  @Override
  public Profileiterator createCoworkersIterator(String profileEmail) {
    return new LinkedInIterator(this, "coworkers", profileEmail);
  }
}
