package timeDiff;

/**
 *
 * @author Travis "Kent" Graves
 */
public class TestClock {

  /**
   * @param args 
   * argument 1 - start time in hours:minutes:seconds
   * argument 2 - stop time in hours:minutes:seconds
   */
  public static void main ( String[] args ) {
    
    String startTime = "null";
    String stopTime = "null";
    
    // Check to make sure we have command line arguments
    // Also check that arguments are in the correct format
    if (args.length == 2 &&
        args[0].matches("\\d{1,2}:\\d{1,2}:\\d{1,2}") == true &&
        args[1].matches("\\d{1,2}:\\d{1,2}:\\d{1,2}") == true) {
      
      startTime = args[0];
      stopTime = args[1];
      
      if (startTime.matches("\\d{1}:.*")) {
        startTime = 0 + startTime;
      }
      
      if (stopTime.matches("\\d{1}:.*")) {
        stopTime = 0 + stopTime;
      }
      
      System.out.println( "Start Time: " + startTime + 
          "\nStop Time: " + stopTime);

    } else {
      
        System.out.print("Arguments Invalid: ");
        for (int i=0;i<args.length;i++) {
          System.out.print(args[i] + " ");
        }
        System.out.println("\nUsage: java TestClock 11:22:38 11:23:45");
        System.exit(0);
        
    }

    TimeDiff timeDiff = new TimeDiff();
    timeDiff.start(startTime);
    timeDiff.stop(stopTime);
    System.out.println("Elapsed time in seconds is: " + timeDiff.getElapsedTime() + "s");

  } // End main method
  
} // End TestClock Class
