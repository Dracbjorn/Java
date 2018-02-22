package headphones;

/**
 *
 * @author Travis "Kent" Graves
 */
public class TestHeadPhones {
  public static void main ( String[] args ) {
    
    HeadPhones headPhones1 = new HeadPhones();
    headPhones1.setManufacturer("Sony");
    headPhones1.setHeadPhoneColor("Black");
    headPhones1.changeVolume(1);
    headPhones1.setPluggedIn(true);
    headPhones1.getManufacturer();
    headPhones1.getHeadPhoneColor();
    headPhones1.getVolume();
    headPhones1.getPluggedIn();
    headPhones1.toString();
    
    HeadPhones headPhones2 = new HeadPhones();
    headPhones2.setManufacturer("Bose");
    headPhones2.setHeadPhoneColor("Blue");
    headPhones2.changeVolume(2);
    headPhones2.setPluggedIn(true);
    headPhones2.getManufacturer();
    headPhones2.getHeadPhoneColor();
    headPhones2.getVolume();
    headPhones2.getPluggedIn();
    headPhones2.toString();
    
    HeadPhones headPhones3 = new HeadPhones();
    headPhones3.setManufacturer("Skullcandy");
    headPhones3.setHeadPhoneColor("Red");
    headPhones3.changeVolume(3);
    headPhones3.setPluggedIn(true);
    headPhones3.getManufacturer();
    headPhones3.getHeadPhoneColor();
    headPhones3.getVolume();
    headPhones3.getPluggedIn();
    headPhones3.toString();

  }

}
