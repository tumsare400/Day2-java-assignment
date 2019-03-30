public class Time{
                 int hours;
                 int minutes;

                 public void set(int hours, int minutes){
                 this.hours=hours;
                 this.minutes=minutes;
                 }
                 public void showTime(){
                   if(minutes>=60)
                   {
                         hours=hours+1;
                         minutes=minutes-60;
                      System.out.println("Time="+ hours +" "+ minutes);
                   }
                  System.out.println("Time="+ hours +" "+ minutes);
                 }
                public Time sum(Time t3){
                   Time t4=new Time();
                   t4.hours=this.hours+t3.hours;
                   t4.minutes=this.minutes+t3.minutes;
                   return t4;

                }
}