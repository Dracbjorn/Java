package BongoDrum;

/**
 *
 * @author Travis "Kent" Graves
 */
public class BongoDrum {

 private int sizeOfDrum;
 private int beatsPerMinute;
 private int beatPressure;
 private String manufacturer;
 private final int HARD = 3;
 private final int MEDIUM = 2;
 private final int SOFT = 1;
  
 public BongoDrum() {
   this(0,0,"null");
 }
 
 public BongoDrum(int sizeOfDrum, int beatsPerMinute, String manufacturer) {
   this.sizeOfDrum = 0;
   this.beatsPerMinute = 0;
   this.beatPressure = 0;
   this.manufacturer = "null";
 }
 
 public void setSizeOfDrum (int sizeOfDrum) {
   this.sizeOfDrum = sizeOfDrum;
 }
 
 public void setBeatsPerMinute (int beatsPerMinute) {
   this.beatsPerMinute = beatsPerMinute;
 }
 
 public void setManufacturer (String manufacturer) {
   this.manufacturer = manufacturer;
 }
 
 public void setBeatPressure (int beatPressure) {
   
   switch (beatPressure) {
      
      case SOFT:
        this.beatPressure = SOFT;
        System.out.println( "Beating drum with soft pressure." );
        break;
        
      case MEDIUM:
        this.beatPressure = MEDIUM;
        System.out.println( "Beating drum with medium pressure." );
        break;
        
      case HARD:
        this.beatPressure = HARD;
        System.out.println( "Beating drum with hard pressure." );
        break;
        
      default:
        System.err.println( "Invalid beatPressure!" );
        
    }
 }
 
 public int getSizeOfDrum () {
   return sizeOfDrum;
 }
 
 public int getBeatsPerMinute () {
   return beatsPerMinute;
 }
 
 public String getManufacturer () {
   return manufacturer;
 }
 
 public @Override String toString () {
   
   String drumSpecs = "Size of Drum: " + sizeOfDrum + "\n" +
                      "Beats per Minute: " + beatsPerMinute + "\n" +
                      "Beat pressure is: " + beatPressure + "\n" +
                      "Manufacturer is: " + manufacturer;
                      
   return drumSpecs;
 }
  
}
