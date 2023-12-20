import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation: ");
        
        PartEmployee partE = new PartEmployee(); 
        System.out.println(partE.getPartTimeWage());
    }
}

class Employee{
    private int WPH = 20;   //Wage Per Hour
    private int FDH = 8;    //Full Day Hour

    public int getFDH() {
        return FDH;
    }

    public int getWPH() {
        return WPH;
    }

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

class PartEmployee extends Employee{
    int getPartTimeWage(){
        if(this.isPresent()) return (this.getWPH() * this.getFDH());
        else return 0;
    }
}
