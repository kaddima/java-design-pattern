package org.example.iterators.social.social_networks;

import org.example.iterators.social.iterators.FacebookIterator;
import org.example.iterators.social.profile.Profile;
import org.example.iterators.social.iterators.Profileiterator;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
  private List<Profile> profiles;

  public Facebook(List<Profile> cache){
    if(cache != null){
      this.profiles = cache;
    }else{
      this.profiles = new ArrayList<>();
    }
  }

  public Profile requestProfileFromFacebook(String profileEmail){
    // Here would be a POST request to one of the Facebook API endpoints.
    // Instead, we emulates long network connection, which you would expect
    // in the real life...
    this.simulateNetworkLatency();
    System.out.println("Facebook: Loading profile '"+ profileEmail + "' over the network");
    return this.findProfile(profileEmail);
  }

  public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType){
    // Here would be a POST request to one of the Facebook API endpoints.
    // Instead, we emulates long network connection, which you would expect
    // in the real life...
    simulateNetworkLatency();
    System.out.println("Facebook: Loading '"+contactType+ "' list of '"+profileEmail + "' over the network...");
    Profile profile = findProfile(profileEmail);
    if(profile != null){
      return profile.getContacts(contactType);
    }
    return null;
  }

  private Profile findProfile(String profileEmail){
    for(Profile profile : this.profiles){
      if(profile.getEmail().equals(profileEmail)){
        return profile;
      }
    }
    return null;
  }

  private void simulateNetworkLatency(){
    try{
      Thread.sleep(2500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public Profileiterator createFriendsIterator(String profileEmail){
    return new FacebookIterator(this, "friends", profileEmail);
  }

  @Override
  public Profileiterator createCoworkersIterator(String profileEmail) {
    return new FacebookIterator(this, "coworkers", profileEmail);
  }
}
