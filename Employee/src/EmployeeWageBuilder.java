public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static int calculateWage(Company company){
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

        System.out.println("\nCOMPANY: " + company.COMPANY_NAME);
        System.out.println("TOTAL WAGE: " + totalWage);

        return totalWage;
    }
}
