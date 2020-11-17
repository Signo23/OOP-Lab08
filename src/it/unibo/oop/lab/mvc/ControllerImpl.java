package it.unibo.oop.lab.mvc;

import java.util.ArrayList;
import java.util.List;

public class ControllerImpl implements Controller {

  private final List<String> strings;
  private final String currentString;
  private String nextString;
   /**
    * 
    * @param current
    * @param next
    */
  public ControllerImpl(final String current, final String next) {
    this.currentString = current;
    this.nextString = next;
    strings = new ArrayList<>();
  }
  /**
   * @param str
   */
  public void setNextString(final String str) {
    this.nextString = str;
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
    return this.strings;
  }
  /**
   * @return String
   */
  public String getCurrentString() {
    return this.currentString;
  }

}
