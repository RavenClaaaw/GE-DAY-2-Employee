import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation: ");
        
        Employee employee = new Employee();
        // System.out.println(employee.isPresent());
        System.out.println(employee.getDailyWage());
    }
}

class Employee{
    int WPH = 20;   //Wage Per Hour
    int FDH = 8;    //Full Day Hour

    boolean isPresent(){
        Random random = new Random();
        if(random.nextDouble(0, 1) > 0.5){
            return true;
        } else{
            return false;
        }
    }

    int getDailyWage(){
        if(this.isPresent()) return (WPH * FDH);
        else return 0;
    }
}
