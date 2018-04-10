package Employee_Salaries;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee chuck = new Employee("Chuck", "Testa", 1000);
        Employee stim = new Employee("Stimy", "Bibble", 1);
        System.out.println(chuck.getFirstName() + "'s Yearly Salary: $" + (double) (chuck.getMonthlySalary()) * 12);
        System.out.println(stim.getFirstName() + "'s Yearly Salary: $" + (double) (stim.getMonthlySalary()) * 12);
        chuck.setMonthlySalary((int) ((double) chuck.getMonthlySalary() * 1.10));
        stim.setMonthlySalary((int) ((double) stim.getMonthlySalary() * 1.10));
        System.out.println(chuck.getFirstName() + "'s Yearly Salary: $" + (double) (chuck.getMonthlySalary()) * 12);
        System.out.println(stim.getFirstName() + "'s Yearly Salary: $" + (double) (stim.getMonthlySalary()) * 12);
        System.out.println("");
        stim.setYearlySalary(600000);
        System.out.println("Setting/Getting Yearly Salary Test: $" + stim.getYearlySalary());
        System.out.println("");
        Position boss = new Position("Super Duper", 60);
        boss.setWorker(chuck);
        System.out.println(boss.getTitle() + ", workers get + $" + boss.getBonus());
        System.out.println("Getting Worker Yearly Salary Test: $" + chuck.getYearlySalary());
    }
}
