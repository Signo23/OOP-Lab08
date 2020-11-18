package it.unibo.oop.lab.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ControllerImpl implements Controller {

  private final List<String> printedStrings;
  private String nextString;
   /**
    * 
    * 
    */
  public ControllerImpl() {
    this.printedStrings = new ArrayList<>();
  }
  /**
   * @param str
   */
  public void setNextString(final String str) {
    this.nextString = Objects.requireNonNull(str, "No null string accepted");
  }
  /**
   * @return String
   */
  public String getNextString() {
    return this.nextString;
  }
  /**
   * @return List<String>
   */
  public List<String> getAllStringsPrinted() {
    return this.printedStrings;
  }
  /**
   * 
   */
  public void printCurrentString() {
    if (this.nextString == null) {
      throw new IllegalStateException("No String to print");
    } else {
      this.printedStrings.add(nextString);
      System.out.println(this.nextString);
    }
  }
}

