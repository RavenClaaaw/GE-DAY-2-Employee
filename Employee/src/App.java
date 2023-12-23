import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // COMMIT
        System.out.println("Welcome To Employee Wage Computation: ");
        
        ArrayList<Company> companies = new ArrayList<>();
        companies.add(new Company("Google", 8, 4, 20, 20));
        companies.add(new Company("Microsoft", 8, 4, 25, 25));
        
        ArrayList<Integer> totalwages = EmployeeWageBuilder.calculateWage(companies);
        for(int i=0; i<companies.size(); i++){
            System.out.println("\nCOMPANY:- " + companies.get(i).COMPANY_NAME + "\nTotal Wage:- " + totalwages.get(i));
        }
    }
}