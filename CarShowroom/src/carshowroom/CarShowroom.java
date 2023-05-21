      /*****
*        Samiha Maisha Jeba
*****/
package carshowroom;
import java.util.Scanner;
import java.time.LocalDate;

class Car{
int ID;
String Brand;
String Model;
String Details;
double Price;

public Car(int id, String brand, String model, String detail, double price ){
    ID=id;
    Brand=brand;
    Model=model;
    Details=detail;
    Price=price;
}


void print()
{
    System.out.println("ID: "+ ID);
    System.out.println("Brand: "+Brand);
    System.out.println("Model: "+Model);
    System.out.println("Details: "+Details);
    System.out.println("Price: "+Price);
}
}
 
class Customer{
    int ID;
    String Name;
    String Address;
    String ContactNo;
public Customer(int id, String name, String address, String contno){
    ID=id;
    Name=name;
    Address=address;
    ContactNo=contno;
 
}
void print()
{
    System.out.println("ID: "+ ID);
    System.out.println("Customer Name: "+Name);
    System.out.println("Customer Address: "+Address);
    System.out.println("Contact No: "+ContactNo);
} 
}

class Database{
    LocalDate date;
    int id;
    String CusName;
    String Ad;
    String cnt;
    String Brand;
    String Model;
    double pr;
    double ta;
    double pa;
    double da;
   
    
    void Bill(LocalDate d,int id,String CusName,String Ad,String cnt,String Brand,String Model,double pr,double ta,double pa, double da){
        date=d;
        this.id=id;
       this.CusName=CusName;
       this.Ad=Ad;
       this.cnt=cnt;
       this.Brand=Brand;
       this.Model=Model;
       this.pr=pr;
       this.ta=ta;
       this.pa=pa;
       this.da=da;
    }
    void Checkbill(){
        System.out.println("-----------------------------------------------------------------------------BILL------------------------------------------------");
        System.out.println("---------------------------------------------------------------Provided by: Car Shop Bangladesh--------------------------------------");
        System.out.println("\n Date\t\t\t\t\t: "+date);
        System.out.println(" Customer ID\t\t\t\t: "+ id);
        System.out.println(" Customer Name\t\t\t\t: "+CusName);
        System.out.println(" Customer Address\t\t\t: "+Ad);
        System.out.println(" Car Brand\t\t\t\t: "+Brand);
        System.out.println(" Car MOdel\t\t\t\t: "+Model);
        System.out.println(" Car price\t\t\t\t: "+pr);
        System.out.println(" Total amount\t\t\t\t: "+ ta);
        System.out.println(" Paid amount\t\t\t\t: "+pa);
        if(da>=0) {
            System.out.println(" Due Amount\t\t\t\t: "+da);
            if(da==0)System.out.println("\t\t\t\tThanks for choosing us. If you face any problem contact with us!!!");
            else {System.out.println("\t\t\t\tPay rest of the money maintaining our installment process. Thanks for choosing us.If you face any problem contact with us!!!");}
                }
        else {System.out.println(" Return Amount\t\t\t\t: "+Math.abs(da));
        System.out.println("\t\t\t\tThanks for choosing us. If you face any problem contact with us!!!");
        }
        
        System.out.println("\n************************************************************@Samiha Maisha Jeba****************************************************");
        System.out.println("\n");
    }
}
public class CarShowroom {
    
    public static void main(String[] args) {
        
         Car Toyota1=new Car(1, "Toyota", "COROLLA CROSS Z", "BODY:SUV, FUEL TYPE: OCTANE", 520000);
         Car Toyota2=new Car(2, "Toyota", "TOYOTA CROWN ROYAL SALOON (2017)", "BODY:Sedan, FUEL TYPE: HYYBRID", 700000);
         Car Toyota3=new Car(3, "Toyota", "TOYOTA PRADO TX-L 2019", "BODY:SUV, FUEL TYPE: OCTANE", 300000);
         Car Honda1=new Car(4, "Honda", "HONDA ACCORD TURBO", "The Accord Turbo has a long wheelbase which gives this car a majestic look and the one-touch sunroof makes it stand out. ", 580000);
         Car Honda2=new Car(5, "Honda", "Honda City", "Honda City is one of the good-looking sedan in 1500cc segment which is a direct competitor of Toyota Axio, Premio and Allion. ", 285000);
         Car Honda3=new Car(6, "Honda", "Honda HR-V", " The Honda HR-V features AWD Water Cooled, 4-stroke SOHC i-VTEC with Intelligent Control System that allows the HR-V to proactively send power to the rear wheels. ", 385000);
         Car Lexus1=new Car(7, "Lexus", "Lexus ES 300H", "Lexus ES 300h is a midsize luxury sedan.", 424000);
         Car Lexus2=new Car(8, "Lexus", "Lexus NX", "The Lexus NX is a compact luxury crossover SUV sold by Lexus", 350000);
         Car Lexus3=new Car(9, "Lexus", "Lexus RX 350", "Based on its score within the Luxury Midsize SUVs category,", 250000); 
   String store=""; 
   
      
    while(true)
    {
       
        System.out.println("\t\t\t\t\tWelcome to XYZ Car shop \n");
       System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("\nChoose your desired brand first!");
            System.out.println("Press 1 for toyota");
            System.out.println("Press 2 for Honda");
            System.out.println("Press 3 for Lexus");
            System.out.println("Press e to exit the program.");
           // System.out.println("Press * to go back.");
           Scanner scan = new Scanner(System.in);
           String input= scan.nextLine();
           
          /* if("*".equals(input))
            {
                input="";
                break;
            }*/      
           start:
           
        if("1".equals(input)){
                while(true) {
                    
                    System.out.println("\nWhich model you wish to buy? ");
                    System.out.println("Press 1 for "+ Toyota1.Model);
                    System.out.println("Press 2 for "+ Toyota2.Model);
                    System.out.println("Press 3 for "+ Toyota3.Model);
                    System.out.println("Press e to exit the program.");
                    System.out.println("Press * to go back.");
                   
                    String input1= scan.nextLine();
                     
                    if("1".equals(input1))
                    {
                        store= Toyota1.Model;
                        Toyota1.print();
                    }
                    else if("2".equals(input1))
                    {
                        store= Toyota2.Model;
                        Toyota2.print();
                    }
                    else if("3".equals(input1))
                    {
                        store= Toyota3.Model;
                        Toyota3.print();
                    }
                    else if("e".equals(input1))
                    {
                        System.exit(0);
                    }
                    else if("*".equals(input1))
                    {
                        break;
                    }
                    else{
                        System.out.println("Wrong input.Choose Again");
                       continue;
                    }
                    
                   
                         if ("1".equals(input) || "2".equals(input) || "3".equals(input)) {
                             boolean f=true;
                             while(f=true){ 
                        System.out.println("\nPress * to go back or choose another model");
                        System.out.println("Press 0 to exit the system.");
                        System.out.println("Press 1 to  make a purchase");
              
                        String in2= scan.nextLine();
                        
                            if("*".equals(in2)) {
                                input1= " ";
                                    break;
                            }
                            if("0".equals(in2)) {
                                    System.exit(0);
                               }  
                              if("1".equals(in2)) {
                                 
                                 Customer C1;
                                  System.out.println("-------------------------------------------------------------------------------------");
                                  System.out.println("Thanks for choosing "+ store+" for purchasing please provide us some information!!!");
                                  System.out.println("Enter your name: ");
                                  String name=scan.nextLine();
                                  
                                  System.out.println("Enter your address: ");
                                  String ad=scan.nextLine();
                                  
                                  System.out.println("Enter your contactno: ");
                                  String cnt=scan.nextLine();
                                  
                                  C1=new Customer(1, name, ad, cnt);
                                  System.out.println("");
                                    C1.print();
                                    double pay;
                                    double totalamount;
                                    double dueamount;
                                  Database d1=new Database();  
                                   if(store==Toyota1.Model){
                                       totalamount=((Toyota1.Price*200)/100)+Toyota1.Price;
                                       System.out.println("You need to pay for "+ store+" is: "+totalamount+ "Tk");
                                       System.out.println("How much you want to pay for "+ store);
                                       pay=scan.nextDouble();
                                       dueamount=totalamount-pay;
                                       d1.Bill(LocalDate.now(), Toyota1.ID, C1.Name, C1.Address, C1.ContactNo, "Toyota", "COROLLA CROSS Z", Toyota1.Price, totalamount, pay, dueamount );
                                       d1.Checkbill();
                                       break start;
                                   }
                                   else if(store==Toyota2.Model){
                                       totalamount=((Toyota2.Price*200)/100)+Toyota2.Price;
                                       System.out.println("You need to pay for "+ store+" is: "+totalamount+ "Tk");
                                       System.out.println("How much you want to pay for "+ store);
                                       pay=scan.nextDouble();
                                       dueamount=totalamount-pay;
                                       d1.Bill(LocalDate.now(), Toyota2.ID, C1.Name, C1.Address, C1.ContactNo, Toyota2.Brand, Toyota2.Model, Toyota2.Price, totalamount, pay, dueamount );
                                       d1.Checkbill();
                                       break start;
                                   } 
                                   else if(store==Toyota3.Model){
                                       totalamount=((Toyota3.Price*200)/100)+Toyota3.Price;
                                       System.out.println("You need to pay for "+ store+" is: "+totalamount+ "Tk");
                                       System.out.println("How much you want to pay for "+ store);
                                       pay=scan.nextDouble();
                                       dueamount=totalamount-pay;
                                       d1.Bill(LocalDate.now(), Toyota3.ID, C1.Name, C1.Address, C1.ContactNo, Toyota3.Brand, Toyota3.Model, Toyota3.Price, totalamount, pay, dueamount );
                                       d1.Checkbill();
                                       break start;
                                   } 
                                    
                            }
                             }
                     
                            }
                        
                    }
                  }
            
            
             else if("2".equals(input)) ////Check this
            {
                 while(true) {
                    System.out.println("\nWhich model you wish to buy? ");
                    System.out.println("Press 1 for "+ Honda1.Model);
                    System.out.println("Press 2 for "+ Honda2.Model);
                    System.out.println("Press 3 for "+ Honda3.Model);
                    System.out.println("Press e to exit the program.");
                    System.out.println("Press * to go back.");
                   
                    String input1= scan.nextLine();
                    if("1".equals(input1))
                    {
                        store= Honda1.Model;
                        Honda1.print();
                    }
                    else if("2".equals(input1))
                    {
                        store= Honda2.Model;
                        Honda2.print();
                    }
                    else if("3".equals(input1))
                    {
                        store= Honda3.Model;
                        Honda3.print();
                    }
                    else if("e".equals(input1))
                    {
                        System.exit(0);
                    }
                    else if("*".equals(input1))
                    {
                        break;
                    }
                     else{
                        System.out.println("Wrong input.Choose Again");
                       continue;
                    }
                    
               
                         if ("1".equals(input) || "2".equals(input) || "3".equals(input)) {
                             boolean f=true;
                             while(f=true){ 
                        System.out.println("\nPress * to go back or choose another model");
                        System.out.println("Press 0 to exit the system.");
                        System.out.println("Press 1 to  make a purchase");
              
                        String in2= scan.nextLine();
                        
                            if("*".equals(in2)) {
                                input1= " ";
                                    break;
                            }
                            if("0".equals(in2)) {
                                    System.exit(0);
                               }  
                              if("1".equals(in2)) {
                                 
                                 Customer C1;
                                  System.out.println("-------------------------------------------------------------------------------------");
                                  System.out.println("Thanks for choosing "+ store+" for purchasing please provide us some information!!!");
                                  System.out.println("Enter your name: ");
                                  String name=scan.nextLine();
                                  
                                  System.out.println("Enter your address: ");
                                  String ad=scan.nextLine();
                                  
                                  System.out.println("Enter your contactno: ");
                                  String cnt=scan.nextLine();
                                  
                                  C1=new Customer(1, name, ad, cnt);
                                  System.out.println("");
                                    C1.print();
                                    double pay;
                                    double totalamount;
                                    double dueamount;
                                  Database d1=new Database();  
                                   if(store.equals(Honda1.Model)){
                                       totalamount=((Honda1.Price*200)/100)+Honda1.Price;
                                       System.out.println("You need to pay for "+ store+" is: "+totalamount+ "Tk");
                                       System.out.println("How much you want to pay for "+ store);
                                       pay=scan.nextDouble();
                                       dueamount=totalamount-pay;
                                       d1.Bill(LocalDate.now(), Honda1.ID, C1.Name, C1.Address, C1.ContactNo, Honda1.Brand, Honda1.Brand, Honda1.Price, totalamount, pay, dueamount );
                                       d1.Checkbill();
                                       break start;
                                   }
                                   else if(store.equals(Honda2.Model)){
                                       totalamount=((Honda2.Price*200)/100)+Honda2.Price;
                                       System.out.println("You need to pay for "+ store+" is: "+totalamount+ "Tk");
                                       System.out.println("How much you want to pay for "+ store);
                                       pay=scan.nextDouble();
                                       dueamount=totalamount-pay;
                                       d1.Bill(LocalDate.now(), Honda2.ID, C1.Name, C1.Address, C1.ContactNo, Honda2.Brand, Toyota2.Model, Honda2.Price, totalamount, pay, dueamount );
                                       d1.Checkbill();
                                       break start;
                                   } 
                                   else if(store.equals(Honda3.Model)){
                                       totalamount=((Honda3.Price*200)/100)+Honda3.Price;
                                       System.out.println("You need to pay for "+ store+" is: "+totalamount+ "Tk");
                                       System.out.println("How much you want to pay for "+ store);
                                       pay=scan.nextDouble();
                                       dueamount=totalamount-pay;
                                       d1.Bill(LocalDate.now(), Honda3.ID, C1.Name, C1.Address, C1.ContactNo, Honda3.Brand, Honda3.Model, Honda3.Price, totalamount, pay, dueamount );
                                       d1.Checkbill();
                                       break start;
                                   } 
                                    
                            }
                             }
                     
                            }
                        
                    }
            }
             else if("3".equals(input))
            {
                  while(true) {
                    System.out.println("\nWhich model you wish to buy? ");
                    System.out.println("Press 1 for "+ Lexus1.Model);
                    System.out.println("Press 2 for "+ Lexus2.Model);
                    System.out.println("Press 3 for "+ Lexus3.Model);
                    System.out.println("Press e to exit the program.");
                    System.out.println("Press * to go back.");
                   
                    String input1= scan.nextLine();
                    if("1".equals(input1))
                    {
                        store= Lexus1.Model;
                        Lexus1.print();
                    }
                    else if("2".equals(input1))
                    {
                        store= Lexus2.Model;
                        Lexus2.print();
                    }
                    else if("3".equals(input1))
                    {
                        store= Lexus3.Model;
                        Lexus3.print();
                    }
                    else if("e".equals(input1))
                    {
                        System.exit(0);
                    }
                    else if("*".equals(input1))
                    {
                        break;
                    }
                     else{
                        System.out.println("Wrong input.Choose Again");
                       continue;
                    }
                    
               
                         if ("1".equals(input) || "2".equals(input) || "3".equals(input)) {
                             boolean f=true;
                             while(f=true){ 
                        System.out.println("\nPress * to go back or choose another model");
                        System.out.println("Press 0 to exit the system.");
                        System.out.println("Press 1 to  make a purchase");
              
                        String in2= scan.nextLine();
                        
                            if("*".equals(in2)) {
                                input1= " ";
                                    break;
                            }
                            if("0".equals(in2)) {
                                    System.exit(0);
                               }  
                              if("1".equals(in2)) {
                                 
                                 Customer C1;
                                  System.out.println("-------------------------------------------------------------------------------------");
                                  System.out.println("Thanks for choosing "+ store+" for purchasing please provide us some information!!!");
                                  System.out.println("Enter your name: ");
                                  String name=scan.nextLine();
                                  
                                  System.out.println("Enter your address: ");
                                  String ad=scan.nextLine();
                                  
                                  System.out.println("Enter your contactno: ");
                                  String cnt=scan.nextLine();
                                  
                                  C1=new Customer(1, name, ad, cnt);
                                  System.out.println("");
                                    C1.print();
                                    double pay;
                                    double totalamount;
                                    double dueamount;
                                  Database d1=new Database();  
                                   if(store.equals(Lexus1.Model)){
                                       totalamount=((Lexus1.Price*200)/100)+Lexus1.Price;
                                       System.out.println("You need to pay for "+ store+" is: "+totalamount+ "Tk");
                                       System.out.println("How much you want to pay for "+ store);
                                       pay=scan.nextDouble();
                                       dueamount=totalamount-pay;
                                       d1.Bill(LocalDate.now(), Lexus1.ID, C1.Name, C1.Address, C1.ContactNo, Lexus1.Brand, Lexus1.Model, Lexus1.Price, totalamount, pay, dueamount );
                                       d1.Checkbill();
                                       break start;
                                   }
                                   else if(store.equals(Lexus2.Model)){
                                       totalamount=((Lexus2.Price*200)/100)+Lexus2.Price;
                                       System.out.println("You need to pay for "+ store+" is: "+totalamount+ "Tk");
                                       System.out.println("How much you want to pay for "+ store);
                                       pay=scan.nextDouble();
                                       dueamount=totalamount-pay;
                                       d1.Bill(LocalDate.now(), Lexus2.ID, C1.Name, C1.Address, C1.ContactNo, Lexus2.Brand, Lexus2.Model, Lexus2.Price, totalamount, pay, dueamount );
                                       d1.Checkbill();
                                       break start;
                                   } 
                                   else if(store.equals(Lexus3.Model)){
                                       totalamount=((Lexus3.Price*200)/100)+Lexus3.Price;
                                       System.out.println("You need to pay for "+ store+" is: "+totalamount+ "Tk");
                                       System.out.println("How much you want to pay for "+ store);
                                       pay=scan.nextDouble();
                                       dueamount=totalamount-pay;
                                       d1.Bill(LocalDate.now(), Lexus3.ID, C1.Name, C1.Address, C1.ContactNo, Lexus3.Brand, Lexus3.Model, Lexus3.Price, totalamount, pay, dueamount );
                                       d1.Checkbill();
                                       break start;
                                   } 
                                    
                            }
                             }
                     
                            }
                        
                    }
            }
             else if("e".equals(input))
            {
                System.exit(0);
            }
           else{
                System.out.println("Wrong Input. Try again");
             }
            
    }
                   
                }
    }
  

            
           
    
    

