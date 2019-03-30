public class Complex{
                    private double real;
                    private double imaginary;

                    public void set(double real, double imaginary){
                       this.real=real;
		       this.imaginary=imaginary;
                    }
		    public void displayComplexNumber(){
                      System.out.println(real+"+i"+imaginary);
                    }
                    public void sumOfcomplexNumber(Complex c1,Complex c2){
                       double real=c1.real+c2.real;
                       double imaginary=c1.imaginary+c2.imaginary;
                       System.out.println(real+"i"+imaginary);
                    }
}