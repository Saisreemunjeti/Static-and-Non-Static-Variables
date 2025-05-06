public class Computer{
   public static String os="Windows";
   String ram;
  public static void main(String [] args){
   System.out.println("OS:" +Computer.os);
   Computer os1=new Computer();
   os1.ram="8GB";
     System.out.println("Computer 1:" +os1.ram);
   Computer os2=new Computer();
   os2.ram="16GB";
     System.out.println("Computer 2:" +os2.ram);
 }
}