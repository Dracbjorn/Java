/*
 Design and implement your own simple class to represent any household item of your choice 
(toaster, fan, hair dryer, piano ...) Your class should have a constructor, one additional method 
and at least one member variable (e.g. boolean isOn to turn the item on or off). Be sure you 
demonstrate your class works properly by constructing an instance of it and calling your method.
 */

package householdobject;

/**
 *
 * @author Travis "Kent" Graves
 */
public class Blender {
  
  private boolean powerState;
  private static int numberPoweredOn = 0;
  private int speedLevel;
  private String substance;
  private static int numberOfBlenders = 0;
  
  public Blender () {
    this(false,0,"empty");
  }
  
  public Blender (boolean powerState, int speedLevel, String substance) {
    this.powerState = powerState;
    this.speedLevel = speedLevel;
    this.substance = "empty";
    numberOfBlenders++;
  }
  
  public void setPowerState (boolean powerState) {
    this.powerState = powerState;
    if (this.powerState == true) {
      numberPoweredOn++;
    }
  }
  
  public void setSpeed (int speedLevel) {
    this.speedLevel = speedLevel;
  }
  
  public void setContents (String substance) {
    this.substance = substance;
  }
  
  public boolean getPowerState () {
    return powerState;
  }
  
  public int getSpeed () {
    return speedLevel;
  }
  
  public String getContents () {
    return substance;
  }
  
  public static void putAway () {
    numberOfBlenders--;
  }
  
  public static int howMany () {
    return numberOfBlenders;
  }
  
  public static int howManyPoweredOn () {
    return numberPoweredOn;
  }
  
}
