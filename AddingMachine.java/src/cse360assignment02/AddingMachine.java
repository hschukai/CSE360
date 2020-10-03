/**
 * Assignment 1
 * Hallie Schukai
 * CSE 360
 * Due 5 Oct. 2020
 */

package cse360assignment02;
public class AddingMachine {
  private int total;
  private String machineDisplay;	//creates the look for the toString
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    machineDisplay = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  /**
   * Add method takes a value and adds it from the total variable value.
   * @param value - value to add
   */
  public void add (int value) {
	  total += value;
	  machineDisplay += " + " + value;
  }

  /**
   * Subtract method takes a value and subtracts it from the total variable value.
   * @param value - value to subtract
   */
  public void subtract (int value) {
	  total -= value;
	  machineDisplay += " - " + value;
  }

  /**
   * toString method; returns as a string.
   */
  public String toString () {
	return machineDisplay;
  }

  /**
   * Clears the display of the 'calculator'
   */
  public void clear() {
	  machineDisplay = "\n";
	  machineDisplay = "0";
  }
}