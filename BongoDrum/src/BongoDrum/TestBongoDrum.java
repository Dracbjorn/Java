package BongoDrum;

/**
 *
 * @author Travis "Kent" Graves
 */
public class TestBongoDrum {
   /**
   * @param args the command line arguments
   */
  public static void main ( String[] args ) {
  
    BongoDrum drum1 = new BongoDrum();
    drum1.setSizeOfDrum(30);
    drum1.setBeatsPerMinute(90);
    drum1.setBeatPressure(1);
    drum1.setManufacturer("Toca Synergy");
    drum1.getSizeOfDrum();
    drum1.getBeatsPerMinute();
    drum1.getManufacturer();
    System.out.println(drum1.toString());
    
    BongoDrum drum2 = new BongoDrum();
    drum2.setSizeOfDrum(15);
    drum2.setBeatsPerMinute(120);
    drum2.setBeatPressure(2);
    drum2.setManufacturer("Meinl");
    drum2.getSizeOfDrum();
    drum2.getBeatsPerMinute();
    drum2.getManufacturer();
    System.out.println(drum2.toString());
    
    BongoDrum drum3 = new BongoDrum();
    drum3.setSizeOfDrum(40);
    drum3.setBeatsPerMinute(90);
    drum3.setBeatPressure(3);
    drum3.setManufacturer("Pearl Primero");
    drum3.getSizeOfDrum();
    drum3.getBeatsPerMinute();
    drum3.getManufacturer();
    System.out.println(drum3.toString());
    
  }
}
