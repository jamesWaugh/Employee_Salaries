package Employee_Salaries;

public class Employee {

    private String firstName;
    private String lastName;
    private int yearlySal;

    public Employee(String fName, String lName, int mSal) {
        this.setFirstName(fName);
        this.setLastName(lName);
        //changed this to yearlySal because it's broken with monthlySal (which no longer exists)
        //kept mSal but multiplied by 12 to make yearlySal
        if (mSal >= 0) {
            this.setYearlySalary(mSal * 12);
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getMonthlySalary() {
        return this.yearlySal / 12;
    }

    public int getYearlySalary() {
        return this.yearlySal;
    }

    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    public void setLastName(String newName) {
        this.lastName = newName;
    }

    public void setMonthlySalary(int newMonth) {
        if (newMonth >= 0) {
            this.yearlySal = newMonth * 12;
        }
    }

    public void setYearlySalary(int newYear) {
        if (newYear >= 0) {
            this.yearlySal = newYear;
        }
    }
}
