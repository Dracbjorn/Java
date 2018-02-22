public class methods {
    //private constructors
    private int hours;
    private int minutes;
    private int seconds;
    
    //nothing being called
    public methods(){
        this(0,0,0);
    }
    //calling the int h from the this keyword
    public methods(int h){
        this(h,0,0);
    }
    //calling h and m
    public methods(int h, int m){
        this(h,m,0);
    }
    //calling all three
    public methods(int h, int m, int s){
        setTime(h,m,s);
    }
 
    public void setTime(int h, int m, int s){
        setHours(h);
        setMinutes(m);
        setSeconds(s);
    }
    //if statement to make sure h is in between 0-24
    public void setHours(int h){
        hours = ((h>=0 && h<24) ? h : 0);
    }
    //if statemtne to make sure m is in between 0-60
    public void setMinutes(int m){
        minutes = ((m>=0 && m<60) ? m : 0);
    }
    //if statement to make sure s is in between 0-60
    public void setSeconds(int s){
        seconds = ((s>=0 && s<60) ? s : 0);
    }
    //calling hours
    public int getHours(){
        return hours;
    }
    //calling minutes
    public int getMinutes(){
        return minutes;
    }
    //calling seconds
    public int getSeconds(){
        return seconds;
    }
    //the return format
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());    
    }
    //another return format
    public String toString(){
        return String.format("%d:%02d:%02d %s", ((hours == 0 || hours == 12) ? 12:hours%12), minutes, seconds, (hours <12? "AM" : "PM"));
    }
    
}
