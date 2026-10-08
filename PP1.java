import java.util.Scanner;

class Student{
    String name;
    int rollno;

    void display(){
        System.out.println("Name :" + name);
        System.out.println("Roll no : " + rollno);
    }
    
}

class Grades extends Student{
    int marks[] = new int[5];

    int ctotal(){
        int total = 0;

        for(int i = 0; i < 5; i++){
            total = total + marks[i];
        }

        return total;
    }

    double avg(){
        return ctotal() / 5.0;
    }

    int maximum(){
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if(i==0){
                max=marks[i];

            }
            else

            if(marks[i] > max){
                max = marks[i];
            }    
        }
        return max;
    }

    int minimum(){
        int min = 0;
        for (int i = 0; i < 5; i++) {
            if(i==0){
                min=marks[i];

            }
            else

            if(marks[i] < min){
                min = marks[i];
            }
        }
        return min;
    }

    void display(){
        super.display();
        System.out.println("This are the grades :");
    }

}

public class PP1 {
    public static void main(String[] args) {
        Grades s1 = new Grades();
        Scanner sc = new Scanner(System.in);
        double average;


        System.out.print("Enter name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter Roll no: ");
        s1.rollno = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Marks : ");
            s1.marks[i] = sc.nextInt();
        }

        
        int total = s1.ctotal();
        average = s1.avg();
        int maximum = s1.maximum();
        int minimum = s1.minimum();

        s1.display();

        for(int i = 0; i<5; i++){
            System.out.println("Subject " + (i + 1) + ":" + s1.marks[i]);
        }

        System.out.println("====MARKS MENU====");
        System.out.println("1.Total Marks");
        System.out.println("2.Average Marks");
        System.out.println("3.highest Marks");
        System.out.println("4.lowest Marks");
        System.out.println("5.Exit");
        
        int choice = 0;
        while(choice !=5){

            choice = sc.nextInt();
            switch(choice){
            case 1:
            System.out.println("Total Marks :" + total);

            break;

            case 2:
            System.out.println("Average Marks : " + average);
            break;

            case 3:
            System.out.println("Highest Marks : " + maximum);
            break;

            case 4:
            System.out.println("Lowest Marks : " + minimum);
            break;

            case 5:
            System.exit(0);
            break;

            default:
            System.out.println("Invalid Choice");


        }
        }

        
        sc.close();
    }
    
    }

