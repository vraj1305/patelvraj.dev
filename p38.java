import java.util.Scanner;
public class p38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String name = "";
        double salary=0;
        String department = "";

        int type=0;
        double bonus = 0;
        double finalsalary=0;

        while(true){
            System.out.println("1.enter emply ");
            System.out.println("2.choose emp type ");
            System.out.println("3.calculate bonus");
            System.out.println("4.display salary ");
            System.out.println("5.exit ");
            
            System.out.println("enter choice ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter em id=");
                    id = sc.nextInt();
                    
                
                    System.out.println("enter em name:");
                    name = sc.next();
                        
                
               
                    System.out.println("enter salary= ");
                     salary = sc.nextInt();
                     
                     
            
                    System.out.println("enter department= ");
                    department = sc.next();

                    System.out.println(" emp details saved");
                    break;


                    case 2:
                        System.out.println("\n1.regular ");
                        System.out.println("2.senior ");

                        System.out.println("choose emp type: ");
                        type = sc.nextInt();

                        if(type == 1){
                            System.out.println(" emp= regular");

                        }
                        else if(type == 2){
                            System.out.println(" emp = senior");
                        }
                        else {
                            System.out.println("not emp");
                        }
                        break;

                        case 3:
                            if(type == 1){
                                bonus = salary * 0.05;
                            }
                            else if(type == 2){
                                bonus = salary * 0.28;
                            }
                            else{
                                System.out.println("choose emp first: ");
                                break;

                            }

                            finalsalary = salary + bonus;

                            System.out.println(" bonus = "+bonus);
                            System.out.println("succesfull ");
                            break;

                            case 4:
                                System.out.println(" ###############################");
                                System.out.println(" emp id="+id);
                                System.out.println("emp name ="+name);
                                System.out.println("depaartment= "+bonus);
                                System.out.println("basic salary= "+salary);
                                System.out.println("bonus= "+bonus);
                                System.out.println("final salary= "+finalsalary);
                                System.out.println("################################### ");

                                break;

                            case 5:
                                System.out.println(" thank you");
                                sc.close();
                                return;

                                default:
                                    System.out.println("invalid choice.");



            }
        }
    }
    
}
