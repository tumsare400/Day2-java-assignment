public class Distance{
                     private double feet;
                     private double inches;

                     public void set(double feet, double inches){
                     this.feet=feet;
                     this.inches=inches;
                     }
             
                     public void displayDistance(){
                         if(this.inches>=12)
                         {
                           this.feet=this.feet+1;
                           this.inches=this.inches-12 ;
                         }
                         System.out.println("Distance="+this.feet+""+this.inches);
                     }
                     public Distance aditionOfDistance( Distance d2){
 			Distance d4=new Distance();
                         d4.feet=this.feet+d2.feet;
                         d4.inches=this.inches+d2.inches;
                        return d4;
                     }
} 