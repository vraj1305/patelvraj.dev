import java.util.Scanner;

class Book{
    int id;
    String bname;
    String aname;
    int price;
    int btype;

    void display(){
        System.out.println("Book ID :" + id);
        System.out.println("Book Name :" + bname);
        System.out.println("Author : " + aname);
        System.out.println("Price : " + price);
        System.out.println("Type : " + btype);
    }
}

class Rbook extends Book{
    
    double discount;
    double dis(){
            discount = price * 0.05;
       return discount; 
    }
    
}

class Pbook extends Book{

    double discount;
    double dis(){
            discount = price * 0.15;
        return discount;
    }

    void display(){
        super.display();
        System.out.println("Discount :" + discount);
        if(btype== 1){
                System.out.println("The Final Price is : " + (price-dis()));  
            }
            else{
                System.out.println("The discount is : " + (price-dis()));
            }
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pbook p1 = new Pbook();
        Rbook r1 = new Rbook();
        int choice = 0;

        while(choice !=6){

        System.out.println("==== LIBRARY MANAGEMENT SYSTEM ====");
        System.out.println("1.Enter Book Details");
        System.out.println("2.Choose Book Type");
        System.out.println("3.Calculate Discount");
        System.out.println("4.Display Final Price");
        System.out.println("5.Display Book Deatils");
        System.out.println("6.Exit");

        choice=sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Enter Book Details: ");
            System.out.println("Enter Book Id :");
            p1.id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Book Name :");
            p1.bname=sc.nextLine();
            System.out.println("Enter Author Namr :");
            p1.aname=sc.nextLine();
            System.out.println("Enter Price :");
            p1.price=sc.nextInt();
            r1.price=p1.price;    
            
            break;
            
            case 2:
            System.out.println("Enter Book Type: \n 1 for Regular \n 2 for Premium");
            p1.btype=sc.nextInt();

            if(p1.btype == 1 || p1.btype == 2){
                System.out.println("Thank you for book selection");
            }
            else{
                System.out.println("Invalid Choice");
            }
            break;

            case 3:
            if(p1.btype== 1){
                System.out.println("The discount is : " + r1.dis());  
            }
            else{
                System.out.println("The discount is : " + p1.dis());
            }
            break;

            case 4:
            if(p1.btype== 1){
                System.out.println("The Final Price is : " + (p1.price-r1.dis()));  
            }
            else{
                System.out.println("The discount is : " + (p1.price-p1.dis()));
            }
            break;

            case 5:
            p1.display();
            break;

            case 6:
            System.out.println("Exit the program");
            return;

            default:
                System.out.println("Invalid Choice");
        }

        }

        sc.close();

    }

    
}
