class Employee{ 
              private int id;
              private String name;
              private double monthlyBasic;

   
              Employee(int id, String name, double monthlyBasic){
              this.id=id;
              this.name= name;
              this.monthlyBasic=monthlyBasic;
              }

              public double getAnnualBasic(){
              return (12*monthlyBasic);
              }

              public double getMonthlyGrossSalary(){ 
              double hra=monthlyBasic*0.5;
              double medicalallowance =1250;
              double conveyanceallowance =800;
      
              return ( monthlyBasic + hra + medicalallowance + conveyanceallowance);
              }

              public double getAnnualGrossSalary(){
     
              return (12 *getMonthlyGrossSalary());
              }

              public double getMonthlyDeductions(){
              double pf=monthlyBasic*0.1;
              double esic=4.75*monthlyBasic/100;
              int  profTax;
     
                 if(getMonthlyGrossSalary() <=10000)
                 {
                     profTax=50;
                 }
                else
                 { 
                   profTax=100; 
                 } 
      
            	   return(pf + esic + profTax);
              }

     	     public double getMonthlyTakeHome(){
   
             return ( getMonthlyGrossSalary() - getMonthlyDeductions());
             }

            public double getAnnualTakeHome(){
      
            return(12 * getMonthlyTakeHome());
            }
}
   