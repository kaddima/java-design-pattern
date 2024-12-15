package org.example.facade.videoconversion;

import java.io.File;

public class Demo {
  public static void main(String[] args) {
    VidoConversionFacade converter = new VidoConversionFacade();
    File mp4Video = converter.convertVideo("youtubeVideo.ogg", "mp4");
  }
}
