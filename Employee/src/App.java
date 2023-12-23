import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation: ");
        
        ArrayList<Integer> wages = new ArrayList<>();
        EmployeeWageBuilder company1 = new EmployeeWageBuilder("Company - 1", 8, 4, 20, 20);
        EmployeeWageBuilder company2 = new EmployeeWageBuilder("Company - 2", 7, 3, 24, 20);

        wages.add(EmployeeWageBuilder.calculateWage(company1));
        wages.add(EmployeeWageBuilder.calculateWage(company2));
    }
}

class EmployeeWageBuilder{
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    final String COMPANY;
    final int HOURS_FULL_TIME, HOURS_PART_TIME, WAGE_PER_HOUR, WORKING_DAYS;

    EmployeeWageBuilder(String COMPANY, int HOURS_FULL_TIME, int HOURS_PART_TIME, int WAGE_PER_HOUR, int WORKING_DAYS){
        this.COMPANY = COMPANY;
        this.HOURS_FULL_TIME = HOURS_FULL_TIME;
        this.HOURS_PART_TIME = HOURS_PART_TIME;
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
        this.WORKING_DAYS = WORKING_DAYS;
    }

    public static int calculateWage(EmployeeWageBuilder company){
        int totalHours = 0, totalWage = 0;
        for(int i=0; i<company.WORKING_DAYS; i++){
            if(totalHours >= 100) break;

            int type = (int)Math.floor(Math.random() * 10) % 3;
            switch (type) {
                case 1:
                    totalWage += company.WAGE_PER_HOUR * company.HOURS_FULL_TIME;
                    break;
                
                case 2:
                    totalWage += company.WAGE_PER_HOUR * company.HOURS_PART_TIME;
                    break;

                // ABSENT CASE:-
                default:
                    totalWage += 0;
                    break;
            }
        }

        System.out.println("COMPANY: " + company.COMPANY);
        System.out.println("TOTAL WAGE: " + totalWage);

        return totalWage;
    }
}