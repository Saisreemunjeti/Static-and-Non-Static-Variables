public class Product{
   public static String category="Electronics";
   String productName;
  public static void main(String [] args){
     System.out.println("Category:" +category);
   Product product1=new Product();
   product1.productName="Laptop";
     System.out.println("Product 1:" +product1.productName);
   Product product2=new Product();
   product2.productName="Smart Phone";
     System.out.println("Product 2:" +product2.productName);
 }
}