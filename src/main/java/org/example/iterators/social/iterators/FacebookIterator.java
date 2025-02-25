package org.example.iterators.social.iterators;

import org.example.iterators.social.profile.Profile;
import org.example.iterators.social.social_networks.Facebook;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements Profileiterator {
  private Facebook facebook;
  private String type;
  private String email;
  private int currentPosition = 0;
  private List<String> emails = new ArrayList<>();
  private  List<Profile> profiles = new ArrayList<>();

  public FacebookIterator(Facebook facebook, String type, String email){
    this.facebook = facebook;
    this.type = type;
    this.email = email;
  }

  private void lazyLoad(){
    if(emails.isEmpty()){
      List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
      for(String profile: profiles){
        this.emails.add(profile);
        this.profiles.add(null);
      }
    }
  }

  public boolean  hasNext(){
    lazyLoad();
    return this.currentPosition < emails.size();
  }

  public Profile getNext(){
    if(!hasNext()){
      return null;
    }

    String friendEmail = emails.get(currentPosition);
    Profile friendProfile = profiles.get(currentPosition);
    if(friendProfile == null){
      friendProfile = facebook.requestProfileFromFacebook(friendEmail);
      profiles.set(currentPosition, friendProfile);
    }
    currentPosition++;
    return friendProfile;
  }

  public void reset(){
    currentPosition = 0;
  }
}
