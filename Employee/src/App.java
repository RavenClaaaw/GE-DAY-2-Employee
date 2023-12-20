import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation: ");
        
        System.out.println(Employee.isPresent());
    }
}

class Employee{
    static boolean isPresent(){
        Random random = new Random();
        if(random.nextDouble(0, 1) > 0.5){
            return true;
        } else{
            return false;
        }
    }
}
