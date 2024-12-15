package org.example.facade.videoconversion;

import java.io.File;

public class VidoConversionFacade {
  public File convertVideo(String filename, String format){
    System.out.println("VideoConversionFacade: conversion started");
    VideoFile file = new VideoFile(filename);
    Codec sourceCodec = CodecFactory.extract(file);
    Codec destinationCodec;

    if(format.equals("mp4")){
      destinationCodec = new MPEG$CompressionCodec();
    }else{
      destinationCodec = new OggCompressionCodec();
    }
    VideoFile buffer = BitrateReader.read(file, sourceCodec);
    VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
    File result = new AudioMixer().fix(intermediateResult);
    System.out.println("VideoConversionFacade: conversion completed");
    return result;
  }
}
