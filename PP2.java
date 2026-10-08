import java.util.Scanner;

class Details{
    int id;
    String name;
    int salary;
    String department;
    int type;

    void display(){
        System.out.println("Employee ID :" + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Department :" + department);
        System.out.println("Employee Type :" + type);
        System.out.println("Employee Salary :" + salary);
    }
}

class Etype extends Details{

    double cbonus(){

    double bonus= 0;
    if(type == 1){
        bonus = salary * 0.05;
    }
    else if(type == 2){
        bonus = salary * 0.20;
    }

    return bonus;
}

    void display(){
        super.display();
    }
        
}

public class PP2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        Etype e1 = new Etype();

        int choice = 0;

        while(choice !=5){
                
            System.out.println("===EMPLOYEE MANAGEMENT SYSTEM===");
            System.out.println("1.Enter Employee Details");
            System.out.println("2.Choose Employee Type");
            System.out.println("3.Calculate Bonus");
            System.out.println("4.Display Salary");
            System.out.println("5.Exit");

            choice = sc.nextInt();
            switch(choice){

                case 1:
                System.out.print("Enter ID: ");
                e1.id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Name: ");
                e1.name = sc.nextLine();

                System.out.print("Enter Salary: ");
                e1.salary = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Department: ");
                e1.department = sc.nextLine();

                break;

                case 2:
                System.out.println("Enter Employee Type : \n 1. For Regular \n2. For Senior");
                e1.type = sc.nextInt();
                if (e1.type == 1 || e1.type == 2) 
                {   
                  System.out.println("Thank you for your contribution as an employee");  
                }
                else{
                    System.out.println("Invalid choice");
                }
                break;

                case 3:
                System.out.println("The bonus is " + e1.cbonus());
                break;

                case 4:
                System.out.println("The salary is: " + (e1.cbonus()+e1.salary));
                
                
                e1.display();
                

                break;

                case 5:
                System.out.println("Thank you");
                return;

            }
        }

    }
}


