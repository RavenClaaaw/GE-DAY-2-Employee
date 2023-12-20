import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation: ");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Full Time Employee \n2. Part Time Employee");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                FullTime fte = new FullTime();
                break;
            
            case 2:
                PartTime pte = new PartTime();
                break;

            default:
                System.out.println("INVALID OPTION");
                break;
        }
    }
}

class Employee{
    private int hours = 20;   //Full Time Hours
    private int wage = 8;    //Full Time Wage

    public int getHours() {
        return hours;
    }

    public int getWage() {
        return wage;
    }

    boolean isPresent(){
        Random random = new Random();
        if(random.nextDouble(0, 1) > 0.5){
            return true;
        } else{
            return false;
        }
    }
}

class FullTime extends Employee{
    int getDailyWage(){
        if(this.isPresent()) return (this.getHours() * this.getWage());
        else return 0;
    }
}

class PartTime extends Employee{
    int getPartTimeWage(){
        if(this.isPresent()) return (this.getHours() * this.getWage());
        else return 0;
    }
}
