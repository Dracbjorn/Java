/*
 
 */

package olympicLifting;

/**
 *
 * @author Travis "Kent" Graves
 * 
 * Class used to simulate a Barbell
 */

public class Barbell {
    
    // Initiate variables
    private double totalWeight = 0; 
    private int repsLifted;
    final private int maxPlates = 5;
    private double[] plates = new double[maxPlates];
       
    public Barbell() {
    }
    
    public Barbell(double[] plates) {
      this.plates = plates;
      totalWeight = 0;
      repsLifted = 0;
        
    }
    
    // Puts weight on the bar, increasing the weight.
    public void assembleBar(double[] plates) {
        
        totalWeight = 45.0; // Bar weighs 45 lbs.
        for (int i = 0; i < plates.length; i++) {
          totalWeight = (totalWeight + (plates[i] * 2));
        }
        
    }
    
    public void liftTheBar(int reps) throws InterruptedException {
      
      // Do the reps!
      for (int i = 1; i <= reps; i++) {
          System.out.println(i + "...");
          Thread.sleep(1000);
      }

      // Count the reps!
      repsLifted = repsLifted + reps;
        
    }
    
    public int checkReps() {
      return repsLifted;
    }
    
    public double checkWeight() {
        return totalWeight;
    }
    
    public double average(double[] x) {
      double sum = 0;
      
      for (int i = 0; i < x.length; i++) {
        sum = sum + x[i];
      }
      
      double avg = sum / x.length;
      
      return avg;      
      
    }
 
}
