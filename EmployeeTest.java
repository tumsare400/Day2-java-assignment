import java.util.*; 
class EmployeeTest{
 public static void main(String [] args)
   {
     int id;
     String name;
     double monthlyBasic;
     
     Scanner scanner=new Scanner (System.in);

     System.out.println("Enter your ID");
     id=scanner.nextInt(); 
     System.out.println("Enter your Name");
     name=scanner.next(); 
     System.out.println("Enter your monthlyBasic");
     monthlyBasic=scanner.nextDouble(); 
     
     scanner.close();

     Employee e1 = new Employee(id,name,monthlyBasic);
            System.out.println("AnnualBasic="+e1.getAnnualBasic());
            System.out.println("MonthlyGrossSalary="+e1.getMonthlyGrossSalary());
            System.out.println("AnnualGrossSalary="+e1.getAnnualGrossSalary());
            System.out.println("MonthlyDeductions="+e1.getMonthlyDeductions());
            System.out.println("MonthlyTakeHome="+e1.getMonthlyTakeHome()); 
   }
}