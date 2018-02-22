package headphones;

/**
 *
 * @author Travis "Kent" Graves
 */
public class HeadPhones {

  // Allocate variables
  private final int LOW = 1;
  private final int MEDIUM = 2;
  private final int HIGH = 3;
  private int volume;
  private boolean pluggedIn;
  private String manufacturer;
  private String headPhoneColor;
  private static int numOfHeadphones = 0;
  
  
  public HeadPhones() {
    
    volume = 0;
    pluggedIn = false;
    manufacturer = "null";
    headPhoneColor = "null";
    numOfHeadphones++;
    System.out.println( "\nHeadphone " + numOfHeadphones + " created.\n" );
    
  }
  
  public void changeVolume(int volume) {
    
    switch (volume) {
      
      case LOW:
        this.volume = LOW;
        System.out.println( "Volume set to LOW." );
        break;
        
      case MEDIUM:
        this.volume = MEDIUM;
        System.out.println( "Volume set to MEDIUM." );
        break;
        
      case HIGH:
        this.volume = HIGH;
        System.out.println( "Volume set to HIGH." );
        break;
        
      default:
        System.err.println( "Invalid volume level!" );
        
    }
    
  }
  
  public void setPluggedIn(boolean pluggedIn) {
    
    this.pluggedIn = pluggedIn;
    
    if (pluggedIn = true) {
      System.out.println( "Plugged headphones in." );
    } else {
      System.out.println( "Unplugged headphones." );
    }
    
  }
  
  public void setManufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    System.out.println( "Headphones were made by " + manufacturer + ".");
    
  }
  
  public void setHeadPhoneColor(String headPhoneColor) {
    
    this.headPhoneColor = headPhoneColor;
    System.out.println( "The color of the headphones are " + headPhoneColor + "." );
    
  }
  
  public int getVolume() {
    return volume;
  }
  
  public boolean getPluggedIn() {
    return pluggedIn;
  }
  
  public String getManufacturer() {
    return manufacturer;
  }
  
  public String getHeadPhoneColor() {
    return headPhoneColor;
  }
  
  public @Override String toString() {
    
    String settings = "Volume: " + volume + "\n" +
                      "Plugged In: " + pluggedIn + "\n" +
                      "Manufacturer: " + manufacturer + "\n" +
                      "Headphone Color: " + headPhoneColor;
                       
    return settings;
    
  }
}
