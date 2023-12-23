import java.util.ArrayList;

public interface EmployeeWageBuilderInterface {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public ArrayList<Integer> calculateWage(ArrayList<Company> companies);
}