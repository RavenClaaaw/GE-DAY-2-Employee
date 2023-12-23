import java.util.ArrayList;

public class EmployeeWageBuilder implements EmployeeWageBuilderInterface{
    public Wage calculateWage(ArrayList<Company> companies){
        Wage wage = new Wage();

        for(Company company : companies){
            int totalHours = 0, totalWage = 0;

            ArrayList<Integer> dailyWage = new ArrayList<>();
            for(int i=0; i<company.WORKING_DAYS; i++){
                if(totalHours >= 100) break;

                int type = (int)Math.floor(Math.random() * 10) % 3;

                int value = 0;
                switch (type) {
                    case 1:
                        value = company.WAGE_PER_HOUR * company.HOURS_FULL_TIME;
                        break;
                    
                    case 2:
                        value = company.WAGE_PER_HOUR * company.HOURS_PART_TIME;
                        break;

                    // ABSENT CASE:-
                    default:
                        value = 0;
                        break;
                }

                totalWage += value;
                dailyWage.add(value);
            }

            wage.monthlyWage.add(totalWage);
            wage.dailyWage.add(dailyWage);
        }

        return wage;
    }

    public void getWage(int index, Wage wage){
        System.out.println("THE MONTHLY WAGE:- " + wage.monthlyWage.get(index));
        System.out.println("THE DAILY WAGE:- " + wage.dailyWage.get(index));        
    }
}
