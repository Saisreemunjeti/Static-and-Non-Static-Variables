public class Department{
   public static String departmentName="HR";
   String employeeName;
  public static void main(String [] args){
     System.out.println("Department:" +departmentName);
   Department employee1=new Department();
   employee1.employeeName="John";
     System.out.println("Employee 1:" +employee1.employeeName);
   Department employee2=new Department();
   employee2.employeeName="Alice";
     System.out.println("Employee 2:" +employee2.employeeName);
   departmentName="Marketing";
      System.out.println("Department:" +departmentName);
      System.out.println("Employee 1:" +employee1.employeeName);
      System.out.println("Employee 2:" +employee2.employeeName);
   }
}