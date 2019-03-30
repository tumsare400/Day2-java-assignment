public class TimeTest{
    public static void main(String[] args){

    Time t1=new Time();
         t1.set(11, 30);

    Time t2=new Time();
        t2.set(11, 10);

    t1.showTime();
    t2.showTime();

   Time t3;
   t3=t1.sum(t2);
   t3.showTime();
   }
}