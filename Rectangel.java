import java.util.*; 
public class Rectangel{
  public static void main(String [] args){
        double length;
        double width;
      
     Scanner scanner=new Scanner (System.in);

     System.out.println("Enter length of rectangle");
     length=scanner.nextDouble();  

     System.out.println("Enter width of rectangle");
     width=scanner.nextDouble(); 

     Shape obj=new Shape(length, width);
          System.out.println("Area of rectangle="+obj.AreaOfRectangle());
          System.out.println("Perimeter of rectangle="+obj.PerimeterOfRectangle());
   }
  
}