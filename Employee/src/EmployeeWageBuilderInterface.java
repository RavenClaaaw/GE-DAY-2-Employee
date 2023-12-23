import java.util.ArrayList;

public interface EmployeeWageBuilderInterface {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public ArrayList<Integer> wages = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> dailyWages = new ArrayList<>();
    
    public Wage calculateWage(ArrayList<Company> companies);
    public void getWage(int index, Wage wage);
}