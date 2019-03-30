class Shape{ 
          
           private  double length;
           private double width;

           public Shape(double length, double width){
              this.length=length;
              this.width=width;
           }
           public double AreaOfRectangle(){
              return (length*width);
           }
           public double PerimeterOfRectangle(){
              return 2*(length+width);
           }
}