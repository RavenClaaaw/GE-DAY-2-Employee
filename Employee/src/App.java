import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation: ");
        
        Scanner scanner = new Scanner(System.in);

        EmployeeWageBuilder sample = new EmployeeWageBuilder("Sample-Company", 8, 4, 20, 20);

        int totalHours = 0, totalWage = 0;
        for(int i=0; i<sample.WORKING_DAYS; i++){
            if(totalHours >= 100) break;

            int type = (int)Math.floor(Math.random() * 10) % 3;
            switch (type) {
                case 1:
                    totalWage += sample.WAGE_PER_HOUR * sample.HOURS_FULL_TIME;
                    break;
                
                case 2:
                    totalWage += sample.WAGE_PER_HOUR * sample.HOURS_PART_TIME;
                    break;

                // ABSENT CASE:-
                default:
                    totalWage += 0;
                    break;
            }
        }

        System.out.println("TOTAL WAGE: " + totalWage);

        scanner.close();
    }

    static class EmployeeWageBuilder{
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
    }
}