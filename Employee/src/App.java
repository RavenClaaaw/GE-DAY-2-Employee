import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // COMMIT
        System.out.println("Welcome To Employee Wage Computation: ");
        
        ArrayList<Integer> wages = new ArrayList<>();
        Company company1 = new Company("Company - 1", 8, 4, 20, 20);
        Company company2 = new Company("Company - 2", 7, 3, 24, 20);
        
        wages.add(EmployeeWageBuilder.calculateWage(company1));
        wages.add(EmployeeWageBuilder.calculateWage(company2));
    }
}