package com.learn.spring.di;


import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

  private PrintStream stream;

  public SlayDragonQuest(PrintStream stream) {
    this.stream = stream;
  }


  public void embark() {
//    System.out.println("Embarking on quest to slay the dragon!");
    stream.println("Embarking on quest to slay the dragon!");
  }

}
