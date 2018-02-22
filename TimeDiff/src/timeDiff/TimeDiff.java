package timeDiff;

import java.time.LocalTime;

/**
 *
 * @author Travis "Kent" Graves
 */
public class TimeDiff {
  
  private LocalTime startTime;
  private LocalTime stopTime;
  
  public TimeDiff() {
    this(LocalTime.now(),LocalTime.now().plusMinutes(1));    
  } // End default TimeDiff constructor
  
  public TimeDiff(LocalTime startTime, LocalTime stopTime) {
    this.startTime = startTime;
    this.stopTime = stopTime;    
  } // End TimeDiff constructor
  
  public void start(String startTime) {
    this.startTime = LocalTime.parse(startTime);
  }
  
  public void stop(String stopTime) {
    this.stopTime = LocalTime.parse(stopTime);
  } // End start method
  
  public int getElapsedTime() {
    
    String[] parts;
    
    parts = startTime.toString().split(":");
    int[] start = new int[3];
    for (int i=0; i < parts.length; i++) {
      start[i] = Integer.parseInt(parts[i]);
    }
    
    int startSeconds = (((start[0] * 60) * 60) + (start[1] * 60) + start[2]);

    parts = stopTime.toString().split(":");
    int[] stop = new int[3];
    for (int i=0; i < parts.length; i++) {
      stop[i] = Integer.parseInt(parts[i]);
    }
    
    int stopSeconds = (((stop[0] * 60) * 60) + (stop[1] * 60) + stop[2]);
    
    if (startSeconds > stopSeconds) {
      System.out.println( "Cannot have a stop time before the start time!" );
      System.exit(0);
    }
    
    int timeDiff = stopSeconds - startSeconds;

    return timeDiff;
  } // End getElapsedTime Method

}
